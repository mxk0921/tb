package com.etao.feimagesearch.circlesearch;

import android.app.Activity;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.TaoInit;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.uikit.gesture.api.IGlobalGestureListener;
import com.taobao.uikit.gesture.model.GestureContext;
import com.taobao.uikit.gesture.model.GestureEvent;
import tb.agh;
import tb.fgy;
import tb.lg4;
import tb.t2o;
import tb.z7m;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PltCircleSearchGestureListener implements IGlobalGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PltCircleSearchLauncher";
    private static final boolean canUseScreenSnapshot;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/circlesearch/PltCircleSearchGestureListener$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                TaoInit.init();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity l;

        public b(Activity activity) {
            this.l = activity;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/circlesearch/PltCircleSearchGestureListener$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                fgy.INSTANCE.c(this.l);
            }
        }
    }

    static {
        boolean z;
        t2o.a(730857610);
        t2o.a(933232649);
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        } else {
            z = false;
        }
        canUseScreenSnapshot = z;
    }

    @Override // com.taobao.uikit.gesture.api.IGlobalGestureListener
    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return "image_search";
    }

    @Override // com.taobao.uikit.gesture.api.IGlobalGestureListener
    public boolean intercept(GestureEvent gestureEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d8d843f", new Object[]{this, gestureEvent})).booleanValue();
        }
        if (!canUseScreenSnapshot) {
            return false;
        }
        if (!TaoInit.hasInit()) {
            VExecutors.defaultSharedThreadPool().execute(new a());
            return false;
        } else if (gestureEvent.gestureType != 32 || !lg4.m()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.taobao.uikit.gesture.api.IGlobalGestureListener
    public void onGlobalGestureEvent(GestureEvent gestureEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cda6ca", new Object[]{this, gestureEvent});
        } else if (gestureEvent.gestureType == 32 && TaoInit.hasInit()) {
            GestureContext gestureContext = gestureEvent.context;
            if (gestureContext == null) {
                agh.c(TAG, "context is empty");
                return;
            }
            Activity activity = gestureContext.getActivity();
            if (activity != null) {
                agh.c(TAG, "receive gesture " + gestureEvent.context.getActivityName());
                z7m.c(new b(activity));
            }
        }
    }
}
