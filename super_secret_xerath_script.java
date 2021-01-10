xerath.typeInChat("/ignore all"); // Prevents the scripts from getting tilted
while (xerath.isAlive()) {
  if (xerath.enemyChampNearby()) {
    xerath.rotate(360); // mom get the camera
    xerath.press('q');
  } else {
    xerath.spamEmote(); // Blitzcrank question mark emote tilts people well
    xerath.spamMastery(); // Mastery 7 works best
    xerath.runItDown();
  }
  // Recall if q is on cooldown
  if (xerath.isDown('q')){  
	xerath.press('b');
  }
  while(xerath.bootyNourished == false) {
    xerath.typeInChat("Give me da booty!!!!");
  }
  if (xerath.killCount() > 0) {
	xerath.typeInChat("Booty received");
	xerath.bootyNourished = true;
  }
  // Boss Chan pls review
  if (playingWithJoseph()){
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
