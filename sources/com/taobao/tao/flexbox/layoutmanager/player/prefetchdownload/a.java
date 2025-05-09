package com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.PrefetchDownloadConfigBean;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import tb.akt;
import tb.fw8;
import tb.g7m;
import tb.nwv;
import tb.qp0;
import tb.sz3;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PrefetchDownloadConfigBean f12346a;
    public boolean b = false;
    public boolean c = false;
    public final LruCache<String, MediaInfoBean> d = new LruCache<>(8);
    public List<TBVideoComponent> e = new ArrayList();
    public long f = 0;
    public long g = 0;
    public fw8 h;
    public float i;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class C0701a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f12347a = new a();

        static {
            t2o.a(502268306);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae1af0be", new Object[0]);
            }
            return f12347a;
        }
    }

    static {
        t2o.a(502268305);
        t2o.a(502268302);
    }

    public static a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8d368959", new Object[0]);
        }
        return C0701a.a();
    }

    public boolean a() {
        PrefetchDownloadConfigBean prefetchDownloadConfigBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b1544f9", new Object[]{this})).booleanValue();
        }
        if (m() && (prefetchDownloadConfigBean = this.f12346a) != null && nwv.o(prefetchDownloadConfigBean.enable, false)) {
            return !r();
        }
        return true;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be1d", new Object[]{this})).floatValue();
        }
        if (this.i <= 0.0f) {
            this.i = qp0.c();
        }
        return this.i;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71000687", new Object[]{this});
        } else if (this.f12346a == null) {
            String C2 = akt.C2();
            if (!TextUtils.isEmpty(C2)) {
                try {
                    this.f12346a = (PrefetchDownloadConfigBean) JSON.parseObject(C2, PrefetchDownloadConfigBean.class);
                } catch (Throwable th) {
                    tfs.e("romJson error", th.getMessage());
                }
            } else {
                tfs.c("TNodePlayerPrefetchManager", "prefetch AB Test config is null");
            }
        }
    }

    public final List<MediaInfoBean> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bba7b55", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (sz3.a(this.e)) {
            return arrayList;
        }
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            TBVideoComponent tBVideoComponent = (TBVideoComponent) it.next();
            TBVideoComponent.u viewParams = tBVideoComponent.getViewParams();
            if (viewParams != null) {
                if (TextUtils.isEmpty(viewParams.A0) || (TextUtils.isEmpty(viewParams.Z0) && TextUtils.isEmpty(viewParams.a1))) {
                    tfs.c("TNodePlayerPrefetchManager", "videoId或者播控为空");
                } else if (g7m.o().D(tBVideoComponent.q0())) {
                    tfs.c("TNodePlayerPrefetchManager", "正在播放的视频，不使用预下载,预下载list去除");
                } else if (this.d.get(viewParams.A0) != null) {
                    tfs.c("TNodePlayerPrefetchManager", "videoId4 移除:" + viewParams.A0 + "——videoResourceStr:" + viewParams.Z0);
                } else {
                    MediaInfoBean mediaInfoBean = new MediaInfoBean();
                    boolean o = VideoControllerManager.o(viewParams);
                    mediaInfoBean.enableBitOpti = o;
                    if (o) {
                        mediaInfoBean.videoResourceStr = viewParams.a1;
                    } else {
                        mediaInfoBean.videoResourceStr = viewParams.Z0;
                    }
                    mediaInfoBean.videoId = viewParams.A0;
                    tfs.c("TNodePlayerPrefetchManager", "videoId4 增加:" + mediaInfoBean.videoId + "——videoResourceStr:" + mediaInfoBean.videoResourceStr);
                    arrayList.add(mediaInfoBean);
                    this.d.put(mediaInfoBean.videoId, mediaInfoBean);
                }
            }
        }
        tfs.c("TNodePlayerPrefetchManager", "videoId4 移除后:" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MediaInfoBean mediaInfoBean2 = (MediaInfoBean) it2.next();
            tfs.c("TNodePlayerPrefetchManager", "videoId4:" + mediaInfoBean2.videoId + "——videoResourceStr:" + mediaInfoBean2.videoResourceStr);
        }
        return arrayList;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
            return;
        }
        tfs.c("TNodePlayerPrefetchManager", "onDisappear回调完成，停止预下载");
        q();
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282444f", new Object[]{this, context});
            return;
        }
        tfs.c("TNodePlayerPrefetchManager", "onFindTargetVideo,触发预下载");
        p(context);
    }

    public void h(g7m.c cVar) {
        TBVideoComponent tBVideoComponent;
        TBVideoComponent tBVideoComponent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a89f600", new Object[]{this, cVar});
        } else if ((cVar == null || (tBVideoComponent2 = cVar.b) == null || tBVideoComponent2.getViewParams() == null || !cVar.b.getViewParams().d1) && cVar != null && (tBVideoComponent = cVar.b) != null && tBVideoComponent.getNode() != null && cVar.b.getNode().N() != null) {
            tfs.c("TNodePlayerPrefetchManager", "onFirstFrame回调完成，调用startPrefetch方法");
            p(cVar.b.getNode().N());
        }
    }

    public void i(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6531a1", new Object[]{this, tBVideoComponent});
        } else {
            this.b = false;
        }
    }

    public void n(Component component, List<n> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd51fcd", new Object[]{this, component, list, new Boolean(z)});
            return;
        }
        try {
            if (sz3.d(list) && sz3.d(o(list)) && component.getNode() != null && !z) {
                g(component.getNode().N());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final List<TBVideoComponent> o(List<n> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d5a5ea8b", new Object[]{this, list});
        }
        this.e = new ArrayList();
        if (a()) {
            return this.e;
        }
        if (sz3.a(list)) {
            return this.e;
        }
        tfs.c("TNodePlayerPrefetchManager", "视频的数目：" + list.size());
        for (n nVar : list) {
            TBVideoComponent.u viewParams = ((TBVideoComponent) nVar.K()).getViewParams();
            if (viewParams == null) {
                tfs.c("TNodePlayerPrefetchManager", "参数未null");
            } else if (!viewParams.e1) {
                tfs.c("TNodePlayerPrefetchManager", "TNode开关设置禁用预加载，不使用预下载");
            } else if (g7m.o().D(((TBVideoComponent) nVar.K()).q0())) {
                tfs.c("TNodePlayerPrefetchManager", "正在播放的视频，不使用预下载");
            } else if (viewParams.L()) {
                tfs.c("TNodePlayerPrefetchManager", "直播数据不使用预下载");
            } else if (viewParams.d1) {
                tfs.c("TNodePlayerPrefetchManager", "缓存不使用预下载");
            } else if (viewParams.c1) {
                tfs.c("TNodePlayerPrefetchManager", "话题不使用预下载");
            } else {
                String str = viewParams.Z0;
                if (VideoControllerManager.o(viewParams)) {
                    str = viewParams.a1;
                }
                if (TextUtils.isEmpty(str)) {
                    tfs.c("TNodePlayerPrefetchManager", "没有播控数据");
                } else if (!TextUtils.isEmpty(viewParams.A0)) {
                    this.e.add((TBVideoComponent) nVar.K());
                }
            }
        }
        return this.e;
    }

    public final void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94da5348", new Object[]{this, context});
        } else if (this.b) {
            tfs.c("TNodePlayerPrefetchManager", "startPrefetch，正在滑动，return");
        } else if (this.c) {
            tfs.c("TNodePlayerPrefetchManager", "startPrefetch，双列流点击过了，return");
        } else if (a()) {
            tfs.c("TNodePlayerPrefetchManager", "startPrefetch，时间不满足，return");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f < 50) {
                tfs.c("TNodePlayerPrefetchManager", "startPrefetch，开始预下载调用间隔小于50ms，return掉");
                return;
            }
            this.f = currentTimeMillis;
            List<MediaInfoBean> e = e();
            if (sz3.d(e)) {
                if (this.h == null) {
                    this.h = new fw8(context);
                }
                this.h.s(e, this.f12346a);
            }
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f19c20", new Object[]{this});
        } else if (m()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.g < 50) {
                tfs.c("TNodePlayerPrefetchManager", "stopPrefetch，停止预下载调用间隔小于50ms，return掉");
                return;
            }
            this.g = currentTimeMillis;
            fw8 fw8Var = this.h;
            if (fw8Var != null) {
                fw8Var.o();
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0f885d", new Object[]{this});
            return;
        }
        this.b = true;
        tfs.c("TNodePlayerPrefetchManager", "onScrolling，停止预下载");
        q();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80278863", new Object[]{this});
            return;
        }
        this.c = true;
        tfs.c("TNodePlayerPrefetchManager", "onVideoCardClick回调，停止预下载");
        q();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        this.c = false;
        tfs.c("TNodePlayerPrefetchManager", "onViewAppear，重置click标记位");
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc3ddd87", new Object[]{this})).booleanValue();
        }
        if (!akt.B1()) {
            return false;
        }
        d();
        PrefetchDownloadConfigBean prefetchDownloadConfigBean = this.f12346a;
        if (prefetchDownloadConfigBean == null || !nwv.o(prefetchDownloadConfigBean.enable, false)) {
            return false;
        }
        tfs.c("TNodePlayerPrefetchManager", "命中预下载AB实验");
        PrefetchDownloadConfigBean prefetchDownloadConfigBean2 = this.f12346a;
        float f = prefetchDownloadConfigBean2.limitDeviceScore;
        if (f > 0.0f) {
            return b() >= f;
        }
        return nwv.o(prefetchDownloadConfigBean2.enable, false);
    }

    public final boolean r() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78f0e156", new Object[]{this})).booleanValue();
        }
        PrefetchDownloadConfigBean prefetchDownloadConfigBean = this.f12346a;
        if (prefetchDownloadConfigBean != null && sz3.d(prefetchDownloadConfigBean.timeRanges)) {
            Calendar instance = Calendar.getInstance();
            int i = (instance.get(11) * 60) + instance.get(12);
            Iterator<PrefetchDownloadConfigBean.TimeRange> it = this.f12346a.timeRanges.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PrefetchDownloadConfigBean.TimeRange next = it.next();
                long j = i;
                if (j >= next.start.longValue() && j < next.end.longValue()) {
                    z = true;
                    break;
                }
            }
        }
        tfs.c("TNodePlayerPrefetchManager", "prefetch AB Test config validConfigTime：" + z);
        return z;
    }
}
