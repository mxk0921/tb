package com.taobao.tao;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.TBFragmentTabHost;
import tb.ror;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBMainHost implements ror {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ror f11875a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static final TBMainHost INSTANCE = new TBMainHost();

        static {
            t2o.a(775946331);
        }
    }

    static {
        t2o.a(775946329);
        t2o.a(775946327);
    }

    public static ror a(Context context) {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ror) ipChange.ipc$dispatch("3fe22566", new Object[]{context});
        }
        if (context instanceof ror) {
            return (ror) context;
        }
        TBMainHost b2 = b();
        if (b2 == null || (context2 = b2.getContext()) == null || !context2.equals(context)) {
            return null;
        }
        return b2;
    }

    public static TBMainHost b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMainHost) ipChange.ipc$dispatch("14da881f", new Object[0]);
        }
        return b.INSTANCE;
    }

    public static ror fromActivity(Activity activity) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ror) ipChange.ipc$dispatch("eba73c7c", new Object[]{activity});
        }
        if (activity instanceof ror) {
            return (ror) activity;
        }
        TBMainHost b2 = b();
        if (b2 == null || (context = b2.getContext()) == null || !context.equals(activity)) {
            return null;
        }
        return b2;
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd8930", new Object[]{this, context});
        } else if (context instanceof ror) {
            this.f11875a = (ror) context;
        }
    }

    @Override // tb.dvd
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        ror rorVar = this.f11875a;
        if (rorVar != null) {
            return rorVar.checkLogin();
        }
        return false;
    }

    public void d(ror rorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8237a642", new Object[]{this, rorVar});
        } else {
            this.f11875a = rorVar;
        }
    }

    @Override // tb.dvd
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
            return;
        }
        ror rorVar = this.f11875a;
        if (rorVar != null) {
            rorVar.doLogin();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e483d11", new Object[]{this});
        } else {
            this.f11875a = null;
        }
    }

    @Override // tb.ror
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
        }
        ror rorVar = this.f11875a;
        if (rorVar == null) {
            return null;
        }
        return (T) rorVar.findViewById(i);
    }

    @Override // tb.ror
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        ror rorVar = this.f11875a;
        if (rorVar != null) {
            return rorVar.getContext();
        }
        return null;
    }

    @Override // tb.ror
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
        }
        ror rorVar = this.f11875a;
        if (rorVar != null) {
            return rorVar.getCurrentFragment();
        }
        return null;
    }

    @Override // tb.ror
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        ror rorVar = this.f11875a;
        if (rorVar != null) {
            return rorVar.getFragmentTabHost();
        }
        return null;
    }

    @Override // tb.ror
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        ror rorVar = this.f11875a;
        if (rorVar != null) {
            return rorVar.getName();
        }
        return null;
    }

    @Override // tb.ror
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f06186", new Object[]{this});
        }
        ror rorVar = this.f11875a;
        if (rorVar != null) {
            return rorVar.getSimpleName();
        }
        return null;
    }

    @Override // tb.ror
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        ror rorVar = this.f11875a;
        if (rorVar != null) {
            return rorVar.isLowMemory();
        }
        return false;
    }

    @Override // tb.ror
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
            return;
        }
        ror rorVar = this.f11875a;
        if (rorVar != null) {
            rorVar.restoreTabHost();
        }
    }

    private TBMainHost() {
    }
}
