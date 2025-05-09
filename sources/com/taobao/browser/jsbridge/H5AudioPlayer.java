package com.taobao.browser.jsbridge;

import android.media.MediaPlayer;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class H5AudioPlayer extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = H5AudioPlayer.class.getSimpleName();
    public String playId;
    public String url;
    public Session session = new Session();
    private MediaPlayer mediaPlayer = new MediaPlayer();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Session {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String playId;
        private WVCallBackContext webContext;

        static {
            t2o.a(619708513);
        }

        private Session() {
        }

        public static /* synthetic */ void access$200(Session session) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea2cabcf", new Object[]{session});
            } else {
                session.clearSession();
            }
        }

        public static /* synthetic */ String access$500(Session session) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7b9900f4", new Object[]{session});
            }
            return session.playId;
        }

        public static /* synthetic */ WVCallBackContext access$600(Session session) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WVCallBackContext) ipChange.ipc$dispatch("58af2be8", new Object[]{session});
            }
            return session.webContext;
        }

        private void clearSession() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f3bbb90", new Object[]{this});
                return;
            }
            this.playId = null;
            this.webContext = null;
        }

        public String getPlayId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7055b4", new Object[]{this});
            }
            return this.playId;
        }

        public WVCallBackContext getWebContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WVCallBackContext) ipChange.ipc$dispatch("12d4375b", new Object[]{this});
            }
            return this.webContext;
        }

        public void setPlayId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad444e42", new Object[]{this, str});
            } else {
                this.playId = str;
            }
        }

        public void setWebContext(WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef5d8d01", new Object[]{this, wVCallBackContext});
            } else {
                this.webContext = wVCallBackContext;
            }
        }
    }

    static {
        t2o.a(619708509);
    }

    public static /* synthetic */ void access$100(H5AudioPlayer h5AudioPlayer, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594f849", new Object[]{h5AudioPlayer, str, wVCallBackContext});
        } else {
            h5AudioPlayer.notifyCurrentStopImpl(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ IWVWebView access$300(H5AudioPlayer h5AudioPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("1d01053a", new Object[]{h5AudioPlayer});
        }
        return h5AudioPlayer.mWebView;
    }

    public static /* synthetic */ MediaPlayer access$400(H5AudioPlayer h5AudioPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayer) ipChange.ipc$dispatch("4fcd0cd6", new Object[]{h5AudioPlayer});
        }
        return h5AudioPlayer.mediaPlayer;
    }

    private String getNotifyJsonStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16324205", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playIdentifier", (Object) str);
        return jSONObject.toJSONString();
    }

    private String getPlayId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7781c2a", new Object[]{this, str});
        }
        Object parse = JSON.parse(str);
        if (parse instanceof JSONObject) {
            return ((JSONObject) parse).getString("playIdentifier");
        }
        return "";
    }

    private String getUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbc479d6", new Object[]{this, str});
        }
        Object parse = JSON.parse(str);
        if (parse instanceof JSONObject) {
            return ((JSONObject) parse).getString("voiceUrl");
        }
        return "";
    }

    public static /* synthetic */ Object ipc$super(H5AudioPlayer h5AudioPlayer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/H5AudioPlayer");
    }

    private void notifyCurrentStopImpl(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31d4820", new Object[]{this, str, wVCallBackContext});
        } else if (str != null && wVCallBackContext != null) {
            wVCallBackContext.fireEvent("AUDIO.IDLE", getNotifyJsonStr(str));
        }
    }

    public void notifyCurrentStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c97d999", new Object[]{this});
        } else {
            notifyCurrentStopImpl(Session.access$500(this.session), Session.access$600(this.session));
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
                this.mediaPlayer.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mediaPlayer = null;
        }
    }

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                this.mediaPlayer.stop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        notifyCurrentStopImpl(this.session.getPlayId(), this.session.getWebContext());
        Session.access$200(this.session);
    }

    public void play(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7ba142", new Object[]{this, wVCallBackContext, str});
            return;
        }
        notifyCurrentStopImpl(this.session.getPlayId(), this.session.getWebContext());
        this.session.setWebContext(wVCallBackContext);
        String playId = getPlayId(str);
        this.playId = playId;
        this.session.setPlayId(playId);
        this.url = getUrl(str);
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                this.mediaPlayer.setDataSource(this.mContext, Uri.parse(this.url));
                this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.taobao.browser.jsbridge.H5AudioPlayer.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public void onCompletion(MediaPlayer mediaPlayer2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer2});
                            return;
                        }
                        H5AudioPlayer h5AudioPlayer = H5AudioPlayer.this;
                        H5AudioPlayer.access$100(h5AudioPlayer, h5AudioPlayer.session.getPlayId(), H5AudioPlayer.this.session.getWebContext());
                        Session.access$200(H5AudioPlayer.this.session);
                    }
                });
                this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.taobao.browser.jsbridge.H5AudioPlayer.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.media.MediaPlayer.OnErrorListener
                    public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("a3e3b6fb", new Object[]{this, mediaPlayer2, new Integer(i), new Integer(i2)})).booleanValue();
                        }
                        H5AudioPlayer h5AudioPlayer = H5AudioPlayer.this;
                        H5AudioPlayer.access$100(h5AudioPlayer, h5AudioPlayer.session.getPlayId(), H5AudioPlayer.this.session.getWebContext());
                        Session.access$200(H5AudioPlayer.this.session);
                        return true;
                    }
                });
                this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.taobao.browser.jsbridge.H5AudioPlayer.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public void onPrepared(MediaPlayer mediaPlayer2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("aa6fc624", new Object[]{this, mediaPlayer2});
                            return;
                        }
                        int duration = mediaPlayer2.getDuration();
                        IWVWebView access$300 = H5AudioPlayer.access$300(H5AudioPlayer.this);
                        access$300.loadUrl("javascript:window.WindVane.fireEvent('AUDIO.START',{'duration':" + duration + ",'url':'" + H5AudioPlayer.this.url + "','playIdentifier':'" + H5AudioPlayer.this.playId + "'});");
                        H5AudioPlayer.access$400(H5AudioPlayer.this).start();
                    }
                });
                this.mediaPlayer.prepareAsync();
            }
        } catch (Exception e) {
            wVCallBackContext.error();
            e.printStackTrace();
        }
        wVCallBackContext.success();
    }

    public void stop(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba188490", new Object[]{this, wVCallBackContext, str});
            return;
        }
        this.session.setWebContext(wVCallBackContext);
        onPause();
        wVCallBackContext.success();
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("play".equals(str)) {
            play(wVCallBackContext, str2);
            return true;
        } else if (!"stop".equals(str)) {
            return false;
        } else {
            stop(wVCallBackContext, str2);
            return true;
        }
    }
}
