const API_URL = "http://localhost:8080/equino"; // Ajusta según tu endpoint real

// 🔹 Función para buscar un nuevo Equino
async function buscarEquino() {
  const id = document.getElementById("buscarId").value;
  const resultadoDiv = document.getElementById("resultado");

  if (!id) {
    resultadoDiv.innerHTML = "<div class='text-danger'>Por favor, ingrese un ID.</div>";
    return;
  }

  try {
    const response = await fetch(`${API_URL}/${id}`);
    if (!response.ok) throw new Error("Caballo no encontrado");

    const data = await response.json();
    resultadoDiv.innerHTML = `
      <div class="alert alert-success">
        <strong>Nombre:</strong> ${data.nombre} <br>
        <strong>Género:</strong> ${data.genero} <br>
        <strong>Tipo de sangre:</strong> ${data.tipo_de_sangre}
      </div>`;
  } catch (error) {
    resultadoDiv.innerHTML = `<div class="alert alert-danger">${error.message}</div>`;
  }
}

// 🔹 Función para crear un nuevo Equino
async function crearEquino() {
  const equino = {
    nombre: document.getElementById("nombre").value,
    apellido: document.getElementById("apellido").value,
    genero: document.getElementById("genero").value,
    tipoDeSangre: document.getElementById("tipoDeSangre").value,
    idChip: document.getElementById("idChip").value,
    estaVivo: document.getElementById("estaVivo").value,
    urlFoto: document.getElementById("urlFoto").value,
    observacion: document.getElementById("observacion").value
  };

  const mensajeDiv = document.getElementById("mensajeCreacion");

  try {
    const response = await fetch(API_URL, {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(equino)
    });

    if (!response.ok) throw new Error("Error al registrar el caballo");

    const data = await response.json();
    mensajeDiv.innerHTML = `
      <div class="alert alert-success">
        Caballo <strong>${data.nombre}</strong> registrado correctamente.
      </div>`;

    // 🧹 Limpiar el formulario después de crear
    document.getElementById("formEquino").reset();

  } catch (error) {
    mensajeDiv.innerHTML = `<div class="alert alert-danger">${error.message}</div>`;
  }
}
