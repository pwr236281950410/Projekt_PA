
package com.example.daybox.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer dzwonekSoundMediaPlayer = MediaPlayer.create(this, R.raw.dzwonek);
        final MediaPlayer glockSoundMediaPlayer = MediaPlayer.create(this, R.raw.glock);
        final MediaPlayer kotSoundMediaPlayer = MediaPlayer.create(this, R.raw.kot);
        final MediaPlayer oklaskiSoundMediaPlayer = MediaPlayer.create(this, R.raw.oklaski);

        final Button dzwonek = (Button) this.findViewById(R.id.dzwonek);
        final Button glock = (Button) this.findViewById(R.id.glock);
        final Button kot = (Button) this.findViewById(R.id.kot);
        final Button oklaski = (Button) this.findViewById(R.id.oklaski);

        final Button playButton = (Button) this.findViewById(R.id.playButton);

        final Vector<Integer> order = new Vector<Integer>();
        oklaski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oklaskiSoundMediaPlayer.start();
                order.add(1);
            }
        });
        kot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kotSoundMediaPlayer.start();
                order.add(2);;
            }
        });
        glock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glockSoundMediaPlayer.start();
                order.add(3);;
            }
        });
        dzwonek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzwonekSoundMediaPlayer.start();
                order.add(4);;
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int records = order.size();
                for(int i=0; i<records; i++)

                {
                    Integer temp = order.get(i);
                    if(temp == 1)
                    {
                        oklaskiSoundMediaPlayer.start();
                    }
                    else if(temp == 2)
                    {
                        kotSoundMediaPlayer.start();
                    }
                    else if(temp == 3)
                    {
                        glockSoundMediaPlayer.start();
                    }
                    else if(temp == 4)
                    {
                        dzwonekSoundMediaPlayer.start();
                    }
                }
            }
        });

    }
}
