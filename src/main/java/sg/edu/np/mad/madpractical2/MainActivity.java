package sg.edu.np.mad.madpractical2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        User user = new User("John Doe", "MAD Developer", 1, false);

        TextView tvName = findViewById(R.id.tvName);
        TextView tvDescription = findViewById(R.id.tvDescription);
        Button btnFollow = findViewById(R.id.btnFollow);

        tvName.setText(user.name);
        tvDescription.setText(user.description);

        // Set initial text for the button based on the 'followed' status
        updateFollowButtonText(btnFollow, user.followed);

        // Add OnClickListener to toggle between "Follow" and "Unfollow" and update 'followed' status
        btnFollow.setOnClickListener(v -> {
            // Toggle the 'followed' status
            user.followed = !user.followed;
            // Update text on the button
            updateFollowButtonText(btnFollow, user.followed);
        });
    }

    // Method to update the text on the button based on 'followed' status
    private void updateFollowButtonText(Button btnFollow, boolean isFollowed) {
        if (isFollowed) {
            btnFollow.setText("Unfollow");
        } else {
            btnFollow.setText("Follow");
        }
    }

}