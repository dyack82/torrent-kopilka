$(function () {

    for (var i = 0; i < 4; i++) {
        var country = $('#country').clone();
        $('#countrys').append(country);
    }

    for (var i = 0; i < 4; i++) {
        var genre = $('#genre').clone();
        $('#genres').append(genre);
    }

    $('#addFilm').click(function () {
        var JSONObject = {
            'name': $("#name").val(),
            'originalName': $("#originalName").val(),
            'ageGroup': $("#ageGroup").val(),
            'duration': $("#duration").val(),
            'description': $("#description").val(),
            'releaseDate': $("#releaseDate").val(),
            'category': $("#category").val(),
            'ratingSum': $("#ratingSum").val(),
            'ratingCount': $("#ratingCount").val(),
            'ratingKinopoisk': $("#ratingKinopoisk").val(),
            'trailerLink': $("#trailerLink").val(),
            'trailerDescription': $("#trailerDescription").val(),
            'onlineLink': $("#onlineLink").val(),
            'country1': $("#country").val(),
            'country2': $("#country +").val(),
            'country3': $("#country ++").val(),
            'country4': $("#country +++").val(),
            'country5': $("#country ++++").val(),
            'genre1': $("#genre").val(),
            'genre2': $("#genre +").val(),
            'genre3': $("#genre ++").val(),
            'genre4': $("#genre +++").val(),
            'genre5': $("#genre ++++").val(),
            'producer1': $("#producer1").val(),
            'producer2': $("#producer2").val(),
            'producer3': $("#producer3").val(),
            'acter1': $("#acter1").val(),
            'acter2': $("#acter2").val(),
            'acter3': $("#acter3").val(),
            'acter4': $("#acter4").val(),
            'acter5': $("#acter5").val(),
            'acter6': $("#acter6").val(),
            'acter7': $("#acter7").val(),
            'acter8': $("#acter8").val(),
            'acter9': $("#acter9").val(),
            'acter10': $("#acter10").val()
        };

        $.ajax({
            type: 'PUT',
            url: 'newCont', // prefix
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(JSONObject),
            dataType: 'json',
            async: true,
            success: function (result) {
                console.log('Error!-----' + result);
            },
            error: function (jqXHR) {
                console.log('Error!+++++' + jqXHR);
            }
        });
    });
 /*************************************/   
        $('#addTorrent').click(function () {
        var JSONObjectTorrent = {
            'nameFilm': $("#nameFilm").val(),
            'kachestvo': $("#kachestvo").val(),
            'format': $("#format").val(),
            'videoCodec': $("#videoCodec").val(),
            'sizeTorrentFile': $("#sizeTorrentFile").val(),
            'perevod': $("#perevod").val(),
            'subtitlesTorrent': $("#subtitlesTorrent").val(),
            'audioCodec': $("#audioCodec").val(),
            'linkTorrent': $("#linkTorrent").val()          
        };

        $.ajax({
            type: 'PUT',
            url: 'newTorrent', // prefix
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(JSONObjectTorrent),
            dataType: 'json',
            async: true,
            success: function (result) {
                console.log('Error!-----' + result);
            },
            error: function (jqXHR) {
                console.log('Error!+++++' + jqXHR);
            }
        });
    });


});

