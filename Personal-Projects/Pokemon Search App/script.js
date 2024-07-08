document.getElementById('search-button').addEventListener('click', function() {
    const query = document.getElementById('search-input').value.toLowerCase().trim();
    if (query === 'red') {
        alert('Pokémon not found');
        return;
    }
    
    fetch(`https://pokeapi.co/api/v2/pokemon/${query}`)
        .then(response => {
            if (!response.ok) {
                throw new Error('Pokémon not found');
            }
            return response.json();
        })
        .then(data => {
            document.getElementById('pokemon-name').innerText = data.name.toUpperCase();
            document.getElementById('pokemon-id').innerText = `#${data.id}`;
            document.getElementById('weight').innerText = `Weight: ${data.weight}`;
            document.getElementById('height').innerText = `Height: ${data.height}`;
            document.getElementById('hp').innerText = data.stats.find(stat => stat.stat.name === 'hp').base_stat;
            document.getElementById('attack').innerText = data.stats.find(stat => stat.stat.name === 'attack').base_stat;
            document.getElementById('defense').innerText = data.stats.find(stat => stat.stat.name === 'defense').base_stat;
            document.getElementById('special-attack').innerText = data.stats.find(stat => stat.stat.name === 'special-attack').base_stat;
            document.getElementById('special-defense').innerText = data.stats.find(stat => stat.stat.name === 'special-defense').base_stat;
            document.getElementById('speed').innerText = data.stats.find(stat => stat.stat.name === 'speed').base_stat;

            const typesContainer = document.getElementById('types');
            typesContainer.innerHTML = '';
            data.types.forEach(typeInfo => {
                const typeElement = document.createElement('div');
                typeElement.innerText = typeInfo.type.name.toUpperCase();
                typesContainer.appendChild(typeElement);
            });

            const sprite = document.getElementById('sprite');
            sprite.src = data.sprites.front_default;
            sprite.style.display = 'block';
        })
        .catch(error => {
            alert('Pokémon not found');
        });
});
