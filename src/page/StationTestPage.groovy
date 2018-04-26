package page

class StationTestPage extends GeneralPage{
    static url = '/station/stationtest1'

    static at ={
//        stationName.present
//        stationName.text() == 'stationtest1'
    }

    static content ={
        stationName{$('div.header-container h1')}
        addSong{$('div.add-song-container h1')}
        findSongBox{$("input[placeholder='Type a video name, e.g., Shape of you']")}
        searchResultBox{$('ul[role=listbox]')}
        firstResult{$('#react-autowhatever-1--item-0')}
        videoPreviewer{$("div.preview iframe")}
        previewSpeaker{$('div.preview__buttons i')}
        messageInput{$("input[placeholder='Do you want to say something about this video?']")}
        addButton{$('div.preview__buttons button.preview__button')}

        videoPlayer{$("div.player iframe")}
        videoInPlaylist{$('div.tab-pane.active img.video-img')}

        playSpeaker{$('div.buttons-wrapper div.icon-wrapper i.icon')}
        modeNormalButtoon{$('div.player-container i.fa-lightbulb-o')}
        modeTheaterButtoon{$('div.passive-mode i.activeButton')}
        shareStationButton{$('#share-station i.fa-share-alt')}
        settingStationModeButton{$('div.btn-icon i.fa-cog')}
        playList{$('div.flip-move-playlist')}

    }
}
