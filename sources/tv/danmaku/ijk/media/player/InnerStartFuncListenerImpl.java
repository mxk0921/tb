package tv.danmaku.ijk.media.player;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InnerStartFuncListenerImpl implements InnerStartFuncListener {
    private long mCurrentTime = System.currentTimeMillis();

    static {
        t2o.a(774898031);
        t2o.a(774898030);
    }

    @Override // tv.danmaku.ijk.media.player.InnerStartFuncListener
    public long getInnerStartTime() {
        return this.mCurrentTime;
    }
}
