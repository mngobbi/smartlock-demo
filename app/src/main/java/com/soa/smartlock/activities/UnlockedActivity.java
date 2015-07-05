package com.soa.smartlock.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.soa.smartlock.R;

public class UnlockedActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.unlocked);
    getActionBar().setDisplayHomeAsUpEnabled(true);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == android.R.id.home) {
      finish();
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

}
