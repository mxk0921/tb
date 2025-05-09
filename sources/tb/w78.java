package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.EditionSwitchView;
import com.taobao.android.editionswitcher.HTaoEditionSwitchView;
import com.taobao.android.editionswitcher.OldEditionSwitchView;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w78 implements xad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<z6d> f30497a;
    public final TBMaterialDialog b;
    public final HomeLocationResult c;
    public final int d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements pzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310393e8", new Object[]{this});
            } else {
                w78.a(w78.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            View customView = w78.b(w78.this).getCustomView();
            if (customView instanceof EditionSwitchView) {
                EditionSwitchView editionSwitchView = (EditionSwitchView) customView;
                editionSwitchView.traceCancelEvent();
                editionSwitchView.onDismiss();
            }
            z6d z6dVar = w78.this.f30497a.get();
            if (z6dVar != null) {
                wcm.a(z6dVar.getClass().getName()).a(w78.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements DialogInterface.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(w78 w78Var) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
            }
            if (i == 4) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(729808901);
    }

    public w78(z6d z6dVar, int i, HomeLocationResult homeLocationResult) {
        this.e = false;
        this.f30497a = new WeakReference<>(z6dVar);
        this.d = i;
        this.c = homeLocationResult;
        this.b = c(z6dVar.k1(), i, homeLocationResult);
    }

    public static /* synthetic */ void a(w78 w78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e81ab4", new Object[]{w78Var});
        } else {
            w78Var.d();
        }
    }

    public static /* synthetic */ TBMaterialDialog b(w78 w78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMaterialDialog) ipChange.ipc$dispatch("66614e55", new Object[]{w78Var});
        }
        return w78Var.b;
    }

    public final TBMaterialDialog c(Context context, int i, HomeLocationResult homeLocationResult) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMaterialDialog) ipChange.ipc$dispatch("352705a7", new Object[]{this, context, new Integer(i), homeLocationResult});
        }
        if (context == null) {
            return null;
        }
        try {
            a aVar = new a();
            if (kbq.h(context)) {
                if (kbq.j(context)) {
                    view = new OldEditionSwitchView(context, i, aVar);
                } else {
                    view = new HTaoEditionSwitchView(context, i, aVar);
                }
            } else if (kbq.i(context)) {
                view = new OldEditionSwitchView(context, i, aVar);
            } else {
                view = new HTaoEditionSwitchView(context, i, aVar);
            }
            bqa.a("EditionSwitcherPopOperation", view.getClass().getName());
            TBMaterialDialog build = new TBMaterialDialog.Builder(view.getContext()).customView(view, false).cardDialog(true).build();
            e(build);
            build.setOnDismissListener(new b());
            return build;
        } catch (Throwable th) {
            bqa.c("EditionSwitcherPopOperation", th, new String[0]);
            return null;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        TBMaterialDialog tBMaterialDialog = this.b;
        if (tBMaterialDialog != null) {
            tBMaterialDialog.setOnDismissListener(null);
            this.b.dismiss();
        }
        z6d z6dVar = this.f30497a.get();
        if (z6dVar != null) {
            wcm.a(z6dVar.getClass().getName()).a(this);
        }
    }

    @Override // tb.xad
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    @Override // tb.xad
    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea8707e9", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // tb.xad
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f996fc7", new Object[]{this});
        }
        return "normal";
    }

    @Override // tb.xad
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        this.e = true;
        TBMaterialDialog tBMaterialDialog = this.b;
        if (tBMaterialDialog != null) {
            tBMaterialDialog.show();
            View customView = this.b.getCustomView();
            if (customView instanceof EditionSwitchView) {
                ((EditionSwitchView) customView).traceShowEvent();
                return;
            }
            return;
        }
        d();
    }

    public final void e(TBMaterialDialog tBMaterialDialog) {
        HomeLocationResult homeLocationResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90f7d23", new Object[]{this, tBMaterialDialog});
        } else if (kbq.k(tBMaterialDialog.getContext()) && this.d == 0 && (homeLocationResult = this.c) != null && TextUtils.equals(homeLocationResult.isNewVillageDialog, "y") && TextUtils.equals(this.c.villageForceSwitch, "y")) {
            try {
                tBMaterialDialog.getView().findViewById(R.id.uik_mdButtonClose).setVisibility(8);
                tBMaterialDialog.setCanceledOnTouchOutside(false);
                tBMaterialDialog.setOnKeyListener(new c(this));
            } catch (Throwable th) {
                bqa.c("EditionSwitcherPopOperation", th, new String[0]);
            }
        }
    }

    public w78(Context context, int i, HomeLocationResult homeLocationResult) {
        this.e = false;
        this.f30497a = new WeakReference<>(null);
        this.d = i;
        this.c = homeLocationResult;
        this.b = c(context, i, homeLocationResult);
    }
}
