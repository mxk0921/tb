package com.taobao.tbicontext;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import tb.ckf;
import tb.pg1;
import tb.t2o;
import tb.ufr;
import tb.vfr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TBILifecycleManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<vfr> f13380a = new ArrayList<>();

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/taobao/tbicontext/TBILifecycleManager$TBILifeCycleEnum;", "", "(Ljava/lang/String;I)V", "OnCreate", "OnStart", "OnRestart", "OnResume", "OnPause", "OnStop", "OnDestroy", "OnAppForeground", "OnAppBackground", "OnSaveInstanceState", "OnRestoreInstanceState", "OnRequestPermissionResult", "OnActivityResult", "OnPreloadStart", "OnPreloadFinish", "OnProcessDataStart", "OnProcessDataFinish", "OnRequestStart", "OnRequestFinish", "OnRenderStart", "OnRenderFinish", "tbi_context_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TBILifeCycleEnum {
        OnCreate,
        OnStart,
        OnRestart,
        OnResume,
        OnPause,
        OnStop,
        OnDestroy,
        OnAppForeground,
        OnAppBackground,
        OnSaveInstanceState,
        OnRestoreInstanceState,
        OnRequestPermissionResult,
        OnActivityResult,
        OnPreloadStart,
        OnPreloadFinish,
        OnProcessDataStart,
        OnProcessDataFinish,
        OnRequestStart,
        OnRequestFinish,
        OnRenderStart,
        OnRenderFinish;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TBILifeCycleEnum tBILifeCycleEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbicontext/TBILifecycleManager$TBILifeCycleEnum");
        }

        public static TBILifeCycleEnum valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("acf8d50e", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(TBILifeCycleEnum.class, str);
            }
            return (TBILifeCycleEnum) valueOf;
        }
    }

    static {
        t2o.a(803209257);
    }

    public final void a(vfr vfrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e66b70e", new Object[]{this, vfrVar});
            return;
        }
        ckf.g(vfrVar, "lifecycle");
        if (!this.f13380a.contains(vfrVar)) {
            this.f13380a.add(vfrVar);
        }
    }

    public final void b(TBILifeCycleEnum tBILifeCycleEnum, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7619986", new Object[]{this, tBILifeCycleEnum, obj});
            return;
        }
        ckf.g(tBILifeCycleEnum, pg1.ATOM_enum);
        Iterator<vfr> it = this.f13380a.iterator();
        while (it.hasNext()) {
            vfr next = it.next();
            switch (ufr.$EnumSwitchMapping$0[tBILifeCycleEnum.ordinal()]) {
                case 1:
                    next.onCreate();
                    break;
                case 2:
                    next.onStart();
                    break;
                case 3:
                    next.onRestart();
                    break;
                case 4:
                    next.onResume();
                    break;
                case 5:
                    next.onPause();
                    break;
                case 6:
                    next.onStop();
                    break;
                case 7:
                    next.onDestroy();
                    break;
                case 8:
                    next.j();
                    break;
                case 9:
                    next.g();
                    break;
                case 10:
                    next.b(obj);
                    break;
                case 11:
                    next.c(obj);
                    break;
                case 12:
                    next.e(obj);
                    break;
                case 13:
                    next.onActivityResult(obj);
                    break;
                case 14:
                    next.h();
                    break;
                case 15:
                    next.i();
                    break;
                case 16:
                    next.a();
                    break;
                case 17:
                    next.d();
                    break;
                case 18:
                    next.k();
                    break;
                case 19:
                    next.f();
                    break;
                case 20:
                    next.m();
                    break;
                case 21:
                    next.l();
                    break;
            }
        }
    }
}
