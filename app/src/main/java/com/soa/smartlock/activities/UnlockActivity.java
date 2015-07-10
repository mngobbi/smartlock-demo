package com.soa.smartlock.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.soa.smartlock.R;

public class UnlockActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.unlock);
    getActionBar().setDisplayHomeAsUpEnabled(true);

    ImageView unlocked = (ImageView) findViewById(R.id.locked);
    unlocked.setBackgroundColor(Color.parseColor("#cccccc"));
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == android.R.id.home) {
      finish();
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

  public void unlock(View view) {
    ImageView locked = (ImageView) findViewById(R.id.locked);
    locked.setBackgroundColor(Color.WHITE);

    ImageView unlocked = (ImageView) findViewById(R.id.unlocked);
    unlocked.setBackgroundColor(Color.parseColor("#cccccc"));
  }

  public void lock(View view) {
    ImageView locked = (ImageView) findViewById(R.id.locked);
    locked.setBackgroundColor(Color.parseColor("#cccccc"));

    ImageView unlocked = (ImageView) findViewById(R.id.unlocked);
    unlocked.setBackgroundColor(Color.WHITE);
  }

}
