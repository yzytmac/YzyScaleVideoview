# YzyScaleVideoview
等比例缩放视频播放控件  
- 未经过等比缩放时，屏幕右边有空白，尽管videoview宽高都撑开，右边也没铺满，如果强行拉伸会变形，不推荐。  
![](https://raw.githubusercontent.com/yzytmac/YzyScaleVideoview/master/videoview.png "未缩放")  
- 经过缩放后会将多余部分裁剪掉，只保留中间部分，图像不会变形。  
![](https://raw.githubusercontent.com/yzytmac/YzyScaleVideoview/master/yzyscalevideoview.png "缩放后")  
- 整个缩放视频播放控件和原声videoview的用法一模一样，除了多一个缩放api外  
- 缩放api调用方式在子线程中调用，因为缩放比较耗时。  

        mVideoView.post(new Runnable() {
                    @Override
                    public void run() {
                        mVideoView.setFixedSize(mVideoView.getWidth(), mVideoView.getHeight());
                        mVideoView.invalidate();
                        mVideoView.setVideoPath("https://raw.githubusercontent.com/yzytmac/YzyScaleVideoview/master/桂林.mp4");
                        mVideoView.start();
                    }
                });

- 如果觉得有用，不吝啬在右上角给我一个Star。谢谢！！  
![](https://raw.githubusercontent.com/yzytmac/yzytmac.github.io/master/images/star.png)  
- 欢迎指正，邮箱：yzytmac@163.com
