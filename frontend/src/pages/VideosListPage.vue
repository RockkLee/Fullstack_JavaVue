<template>
<div>
  <div>VideoListPage</div>
  <!-- <div class="thubnail_container">
    <div v-for="thumbnail in 100" :key="thumbnail">
      <ThumbNail class="thubnail"></ThumbNail>
    </div>
  </div> -->
  <div id="container">
    <div class="row" id="profile-grid">

      <div class="col-sm-3 col-xs-12 profile"
        v-for="thumbnail in 10" :key="thumbnail">
        <div class="panel panel-default">
          <div class="panel-thumbnail">
            <a href="#" title="image 1" class="thumb">
              <img style="color: aqua;" src="//dummyimage.com/900x350.png/c0c0c0&amp;text=image0x201" class="img-responsive img-rounded" data-toggle="modal" data-target=".modal-profile-lg">
            </a>
          </div>
            <div class="panel-body">
            <p class="profile-name">Image 1</p>
            <p>simple description of image 1</p>
            </div>
        </div>
      </div>

    </div>
  </div>
</div>
</template>

<script>
// import ThumbNail from '../components/ThumbNail.vue'

export default {
    name: 'VideosListPage',
    data() {
      return {

      }
    },
    components: {
      // ThumbNail
    }
}
</script>

<style>
/*
.thubnail_container{
  width: 100%;
  height: 100%;
  border-width: 2px;
  border-style: solid;
  display: flex;
}
.thubnail{
  width: 100px;
  height: 100px;
  border-width: 2px;
  border-style: solid;
  display: flex;
}
*/
#container {
  margin-left: 60px;
  margin-right: 60px;
}
#profile-grid { overflow: auto; white-space: normal;}
#profile-grid .profile { padding-bottom: 40px;}
#profile-grid .panel { padding: 0 }
#profile-grid .panel-body { padding: 15px }
#profile-grid .profile-name { font-weight: bold; }
#profile-grid .thumbnail {margin-bottom:6px;}
#profile-grid .img-rounded { border-radius: 4px 4px 4px 4px;}

@media screen and (min-width: 1600px) {
  #profile-grid .panel-thumbnail { overflow: hidden; height: 320px;}
}
@media screen and (max-width: 1600px) {
  #profile-grid .panel-thumbnail { overflow: hidden; height: 180px;}
}

</style>