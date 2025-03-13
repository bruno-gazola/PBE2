// Função para alternar a exibição do menu lateral
function toggleMenu() {
    const menu = document.getElementById('menuLateral');
    if (menu.style.left === '0px') {
        menu.style.left = '-250px';
    } else {
        menu.style.left = '0px';
    }
}
