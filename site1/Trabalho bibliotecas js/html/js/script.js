
google.charts.load('current', {'packages':['corechart', 'table', 'treemap']});
google.charts.setOnLoadCallback(drawChart);

var name = 'Microsoft'
$.ajax({
    method: 'GET',
    url: 'https://api.api-ninjas.com/v1/logo?name=' + name,
    headers: { 'X-Api-Key': 'fSEQeTwVlfEJ2E3zwgsqZu1lI20lDsRKZQdtFox6'},
    contentType: 'application/json',
    success: function(result) {
        console.log(result[0].image);

        // coloque aqui o comando pra mostrar a imagem
        $('#images-container img').attr('src', result[0].image).css({'width': '200px', 'height': 'auto'});
    },
    error: function ajaxError(jqXHR) {
        console.error('Error: ', jqXHR.responseText);
    }
});

function drawChart() {
    // Restante do código para os gráficos...

    // Adicionando a imagem gerada pela API Ninjas
    var imagesContainer = document.getElementById('images-container');
    var img = document.createElement('img');
    img.src = 'https://api.api-ninjas.com/v1/randomimage?category=nature';
    img.alt = 'Imagem de cliente';
    imagesContainer.appendChild(img);
}



function drawChart() {
    // Dados para o gráfico de colunas
    var dataColumnChart = google.visualization.arrayToDataTable([
        ['KPI', 'Valor'],
        ['Ticket Médio de Vendas', 11],
        ['Taxa de Retenção de Clientes', 2],
        ['Margem de Lucro', 2],
        ['Índice de Rotatividade de Estoques', 2],
        ['Tempo Médio de Atendimento', 7],
        ['Índice de Satisfação do Funcionário', 8.5],
        ['Taxa de Engajamento nas Redes Sociais', 70]
    ]);

    var optionsColumnChart = {
        title: 'KPIs da Loja de Varejo',
        legend: { position: 'none' },
        chartArea: { width: '70%' },
        hAxis: {
            title: 'Valor',
            minValue: 0
        },
        vAxis: {
            title: 'KPI'
        }
    };

    // Dados para o gráfico de pizza
    var dataPieChart = google.visualization.arrayToDataTable([
        ['Tipo de Vendas', 'Valor'],
        ['Vendas Online', 30],
        ['Vendas Físicas', 70]
    ]);

    var optionsPieChart = {
        title: 'Distribuição de Vendas',
        pieHole: 0.4,
    };

    // Dados para o gráfico de área de degrau
    var dataStepAreaChart = google.visualization.arrayToDataTable([
        ['Ano', 'Vendas'],
        ['2016', 1000],
        ['2017', 1170],
        ['2018', 660],
        ['2019', 1030]
    ]);

    var optionsStepAreaChart = {
        title: 'Vendas ao longo dos anos',
        legend: { position: 'none' },
        chartArea: { width: '70%' },
        hAxis: {
            title: 'Ano'
        },
        vAxis: {
            title: 'Vendas'
        },
        lineWidth: 2, // Espessura da linha
        areaOpacity: 0.3, // Opacidade da área preenchida
        series: {
            0: { color: '#3366cc' } // Cor da linha
        },
        curveType: 'function', // Tipo de curva
        lineDashStyle: [4, 4], // Estilo de tracejado da linha
        seriesType: 'area', // Tipo de série
        series: {
            0: {
                type: 'area',
                lineDashStyle: [4, 4]
            }
        }
    };

    // Dados para o gráfico de tabela
    var dataTable = new google.visualization.DataTable();
    dataTable.addColumn('string', 'Nome');
    dataTable.addColumn('number', 'Valor');
    dataTable.addRows([
        ['Produto A', 100],
        ['Produto B', 200],
        ['Produto C', 300],
        ['Produto D', 400]
    ]);

    var optionsTableChart = {
        title: 'Vendas por Produto',
        width: '100%',
        height: '100%'
    };

    // Dados para o gráfico de mapa de árvore
    var dataTreeMap = google.visualization.arrayToDataTable([
        ['Local', 'Pai', 'Valor'],
        ['Global', null, 0],
        ['América', 'Global', 0],
        ['Brasil', 'América', 500],
        ['Argentina', 'América', 400],
        ['Europa', 'Global', 0],
        ['Alemanha', 'Europa', 300],
        ['França', 'Europa', 200],
    ]);

    var optionsTreeMapChart = {
        title: 'Vendas por Região',
        width: '100%',
        height: '100%'
    };

    // Desenhar os gráficos
    var columnChart = new google.visualization.ColumnChart(document.getElementById('columnchart'));
    var pieChart = new google.visualization.PieChart(document.getElementById('piechart'));
    var stepAreaChart = new google.visualization.ComboChart(document.getElementById('stepareachart'));
    var tableChart = new google.visualization.Table(document.getElementById('tablechart'));
    var treeMapChart = new google.visualization.TreeMap(document.getElementById('treemapchart'));

    columnChart.draw(dataColumnChart, optionsColumnChart);
    pieChart.draw(dataPieChart, optionsPieChart);
    stepAreaChart.draw(dataStepAreaChart, optionsStepAreaChart);
    tableChart.draw(dataTable, optionsTableChart);
    treeMapChart.draw(dataTreeMap, optionsTreeMapChart);
}
