while (xerath.isAlive()) {
  if (xerath.enemyChampNearby()) {
    xerath.rotate(360); // mom get the camera
    xerath.press('Q');
  } else {
    xerath.spamEmote(); //Blitzcrank question mark emote tilts people well
    xerath.spamMastery(); //mastery 7 works best
    xerath.runItDown();
  }
  if (xerath.qIsDown()){  
	xerath.press('b');
  }
  if (xerath.bootyDeprived()) {
	while(!xerath.gotBooty()) {
	  xerath.typeInChat("Give me da booty!!!!");
	}
  }
  if (xerath.killCount() > 0) {
	xerath.typeInChat("Booty received");
	xerath.bootyNourished();
  }
  // Boss Chan pls review
  if(playingWithJoseph()){
	  xerath.getKill();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.int();
	  xerath.getAssist();
	  xerath.getAssist();
  }
}
