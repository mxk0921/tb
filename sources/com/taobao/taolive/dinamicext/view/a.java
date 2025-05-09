package com.taobao.taolive.dinamicext.view;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import tb.frr;
import tb.t2o;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final MediaLiveInfo f13009a;
    public String b = null;
    public String c = null;
    public AbstractC0742a d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taolive.dinamicext.view.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0742a {
        void retry(boolean z, boolean z2, boolean z3);
    }

    static {
        t2o.a(779092457);
    }

    public a(MediaLiveInfo mediaLiveInfo) {
        this.f13009a = mediaLiveInfo;
        g(mediaLiveInfo, j());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public final int b(MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a8e5687", new Object[]{this, mediaLiveInfo})).intValue();
        }
        if (mediaLiveInfo != null) {
            return c(d(mediaLiveInfo));
        }
        return -1;
    }

    public final int c(ArrayList<QualityLiveItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7997dea", new Object[]{this, arrayList})).intValue();
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return -1;
        }
        if (arrayList.size() == 1) {
            return 0;
        }
        if (arrayList.size() >= 2) {
            return 1;
        }
        return -1;
    }

    public final ArrayList<QualityLiveItem> d(MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f67f148d", new Object[]{this, mediaLiveInfo});
        }
        return mediaLiveInfo.liveUrlList;
    }

    public final boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c268f4c1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        AbstractC0742a aVar = this.d;
        if (aVar != null) {
            aVar.retry(false, false, false);
        }
        this.b = null;
        this.c = null;
        return true;
    }

    public final boolean f(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d7c4e39", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        String str = e;
        TLog.loge(str, "handlePlayError  what = " + i + " extra = " + i2);
        if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.c)) {
            return false;
        }
        e(i);
        if (-10610 == i) {
            return false;
        }
        return true;
    }

    public final void g(MediaLiveInfo mediaLiveInfo, int i) {
        ArrayList<QualityLiveItem> arrayList;
        ArrayList<QualityLiveItem> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc9986b", new Object[]{this, mediaLiveInfo, new Integer(i)});
        } else if (mediaLiveInfo != null && (arrayList = mediaLiveInfo.liveUrlList) != null && arrayList.size() != 0 && i >= 0 && (d = d(mediaLiveInfo)) != null) {
            if (this.c == null && frr.y() && d.get(i).rtcLiveUrl != null) {
                this.c = d.get(i).rtcLiveUrl;
            }
            if (this.b == null && frr.w() && d.get(i).bfrtcUrl != null) {
                this.b = d.get(i).bfrtcUrl;
            }
        }
    }

    public boolean h(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return f(iMediaPlayer, i, i2);
    }

    public void i(AbstractC0742a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb18c43c", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40f1919b", new Object[]{this})).intValue();
        }
        MediaLiveInfo mediaLiveInfo = this.f13009a;
        if (mediaLiveInfo != null) {
            return b(mediaLiveInfo);
        }
        return -1;
    }
}
