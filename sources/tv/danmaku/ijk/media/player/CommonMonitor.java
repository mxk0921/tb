package tv.danmaku.ijk.media.player;

import anet.channel.strategy.HttpDnsAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.nj9;
import tb.r7t;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class CommonMonitor extends AbstractMediaPlayer {
    protected volatile boolean bIsHitCache;
    protected String mBackupCdnIp;
    protected String mCdnIp;
    protected r7t mConfig;
    protected r7t mConfigClone;
    protected String mEncodeType;
    protected Map<String, String> mExtInfo;
    protected long mFirstEndtime;
    protected WeakReference<nj9> mFirstRenderAdapterRef;
    protected WeakReference<InnerStartFuncListener> mInnerStartFuncListener;
    protected String mNetType;
    protected String mPlayUrl;
    protected String mRemoteHost;
    protected long mRenderTimeFromInnerStart;
    protected String mServerIP;
    protected HttpDnsAdapter.HttpDnsOrigin mHttpDnsOrigin = null;
    public long mUserFirstRenderTime = 0;
    protected long mUserPreparedTime = 0;
    protected long mPreparedTime = 0;
    protected long mBufferingCount = 0;
    protected long mBufferingTotalTime = 0;
    protected long mUserStartTime = 0;

    static {
        t2o.a(774898005);
    }
}
