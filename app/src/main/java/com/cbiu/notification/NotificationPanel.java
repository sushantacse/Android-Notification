package com.cbiu.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NotificationPanel extends AppCompatActivity {

    private TextView notification_Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_panel);

        notification_Text = findViewById(R.id.textview);

        String getNotification_message = getIntent().getStringExtra("message");
        notification_Text.setText(getNotification_message);

    }
}
