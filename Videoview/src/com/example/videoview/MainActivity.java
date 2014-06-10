package com.example.videoview;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.SurfaceView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

	VideoView video_player_view; DisplayMetrics dm; SurfaceView sur_View; MediaController media_Controller;
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*final VideoView mVideoView = (VideoView) findViewById(R.id.videoView1);

		String videopath = Environment.getExternalStorageDirectory()+"/Android/data/com.ideausabig.playchat/files/VID_20140515_110811.mp4";
		Bitmap thumbnail = ThumbnailUtils.createVideoThumbnail(videopath, MediaStore.Images.Thumbnails.MINI_KIND);
		
		
		@SuppressWarnings("deprecation")
		BitmapDrawable bitmapDrawable = new BitmapDrawable(thumbnail);
		mVideoView.setBackgroundDrawable(bitmapDrawable);
		
		mVideoView.setVideoPath(videopath); // `videoUri` is your video path.
		
		final MediaController mc = new MediaController(this);
        
		ImageView imgView = (ImageView) findViewById(R.id.img);
		
		imgView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println("dddddddddddddddd");
				mVideoView.setBackgroundDrawable(null);
				
				
			   // getWindow().setFormat(PixelFormat.TRANSLUCENT);
			    mVideoView.setMediaController(mc);
			    
				mVideoView.start();
			}
		});
		
		these are the changes related to my code writtern by vikas soni...
	*/
		
		
		getInit();
		
		
	}

	public void getInit()
	{ 
		video_player_view = (VideoView) findViewById(R.id.video_player_view);
		media_Controller = new MediaController(this);
		dm = new DisplayMetrics();
		this.getWindowManager().getDefaultDisplay().getMetrics(dm);
		int height = dm.heightPixels;
		int width = dm.widthPixels; 
		video_player_view.setMinimumWidth(width);
		video_player_view.setMinimumHeight(height);
		video_player_view.setMediaController(media_Controller); 
		video_player_view.setVideoPath(Environment.getExternalStorageDirectory()+"/Android/data/com.ideausabig.playchat/files/VID_20140515_110811.mp4"); 
		video_player_view.start();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
