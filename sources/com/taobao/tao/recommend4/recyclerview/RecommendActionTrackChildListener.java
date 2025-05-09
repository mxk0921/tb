package com.taobao.tao.recommend4.recyclerview;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.fk9;
import tb.i2b;
import tb.mhd;
import tb.sfh;
import tb.t2o;
import tb.wsa;
import tb.zjn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendActionTrackChildListener implements RecyclerView.OnChildAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler b;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.tao.recommend4.manager.a f12695a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f12696a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public a(JSONObject jSONObject, View view, int i) {
            this.f12696a = jSONObject;
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                zjn.m(this.f12696a, this.b, this.c);
            } catch (Throwable th) {
                TLog.loge("recommend4.RecommendActionTrackChildListener", "trackAppear error.", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f12697a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public b(JSONObject jSONObject, View view, int i) {
            this.f12697a = jSONObject;
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                zjn.o(this.f12697a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f12698a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public c(JSONObject jSONObject, View view, int i) {
            this.f12698a = jSONObject;
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                zjn.n(this.f12698a, this.b, this.c);
            }
        }
    }

    public RecommendActionTrackChildListener(RecommendRecyclerAdapter recommendRecyclerAdapter) {
        this.f12695a = recommendRecyclerAdapter.f;
    }

    public final mhd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mhd) ipChange.ipc$dispatch("38ecf3b8", new Object[]{this});
        }
        com.taobao.tao.recommend4.manager.a aVar = this.f12695a;
        if (aVar == null) {
            return null;
        }
        return aVar.p();
    }

    public final void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f14f41", new Object[]{this, runnable});
        } else {
            b.post(runnable);
        }
    }

    public final void c(JSONObject jSONObject, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c2f88a", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            b(new a(jSONObject, view, i));
        }
    }

    public final void d(JSONObject jSONObject, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbc57f2", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            b(new c(jSONObject, view, i));
        }
    }

    public final void e(JSONObject jSONObject, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cadd70b5", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            b(new b(jSONObject, view, i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517542da", new Object[]{this, view});
        } else if (view.getParent() instanceof ChildRecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view.getParent();
            int position = recyclerView.getLayoutManager().getPosition(view);
            JSONObject W = ((RecommendRecyclerAdapter) recyclerView.getAdapter()).W(position);
            if (W != null && W.getJSONObject("ext") != null && !W.getJSONObject("ext").getBooleanValue("hidden")) {
                if (W.getBooleanValue(zjn.IS_USER_ACTION_TRACKED)) {
                    W.put("isFirstAppear", (Object) Boolean.FALSE);
                } else {
                    W.put("isFirstAppear", (Object) Boolean.TRUE);
                }
                W.put(zjn.IS_USER_ACTION_TRACKED, (Object) Boolean.TRUE);
                sfh.c("real_time_rec", "fast expose sectionBizCode = " + W.getString("sectionBizCode") + " position=" + position);
                JSONObject jSONObject = W.getJSONObject("args");
                if (jSONObject != null) {
                    jSONObject.put("realExposeIndex", (Object) Integer.valueOf(position));
                    if (jSONObject.getJSONObject("utLogMapEdge") != null) {
                        e(W, view, position);
                    } else if (jSONObject.getString("utLogMap") != null) {
                        d(W, view, position);
                    } else {
                        c(W, view, position);
                    }
                    mhd a2 = a();
                    if (a2 != null) {
                        a2.q(view);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
        } else if (view.getParent() instanceof ChildRecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view.getParent();
            JSONObject W = ((RecommendRecyclerAdapter) recyclerView.getAdapter()).W(recyclerView.getLayoutManager().getPosition(view));
            if (W != null && W.getJSONObject("ext") != null && !W.getJSONObject("ext").getBooleanValue("hidden") && W.getJSONObject("args") != null) {
                JSONObject jSONObject = W.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
                if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("arg1"))) {
                    str = "";
                    str2 = str;
                } else {
                    str = jSONObject.getString("arg1");
                    str2 = jSONObject.getString("page");
                }
                b(new fk9(view, (String) view.getTag(R.id.tag_guess_item_id), str2, str));
                mhd a2 = a();
                if (a2 != null) {
                    a2.d(view);
                }
            }
        }
    }

    static {
        t2o.a(729810039);
        HandlerThread a2 = wsa.a("recommend4.ActionTrackChildExpose");
        a2.start();
        b = new Handler(a2.getLooper());
    }
}
