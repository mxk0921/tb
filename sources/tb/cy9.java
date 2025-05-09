package tb;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;
import com.taobao.android.detail.ttdetail.widget.draglayout.a;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cy9 extends sx9 implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final zy9 i = new zy9(-1, -1, 17);

    static {
        t2o.a(912261417);
        t2o.a(912263017);
    }

    public cy9(Context context, ze7 ze7Var, tx9 tx9Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, tx9Var, dataEntryArr);
    }

    public static /* synthetic */ Object ipc$super(cy9 cy9Var, String str, Object... objArr) {
        if (str.hashCode() == -852027584) {
            super.u((oa4) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/FrameLightOffComponent");
    }

    @Override // tb.sx9
    public float D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be4d49b8", new Object[]{this})).floatValue();
        }
        return 1.0f;
    }

    @Override // tb.sx9
    public View J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ae08db79", new Object[]{this});
        }
        return LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_lightoff_frame_component, (ViewGroup) null);
    }

    @Override // tb.sx9
    public void K(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6163973c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int w = w();
        for (int i3 = 0; i3 < w; i3++) {
            String c = RuntimeUtils.c(v(i3));
            if (!TextUtils.isEmpty(c)) {
                UserBehaviorTracker.j(this.mContext, c, i);
                Context context = this.mContext;
                UserBehaviorTracker.k(context, c, "index", "" + i2);
            }
        }
    }

    @Override // tb.sx9
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac08b1a", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public Rect b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c4cab260", new Object[]{this});
        }
        oa4 v = v(0);
        if (v instanceof a) {
            return ((a) v).b();
        }
        return null;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public void c(DragDismissLayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70db4e75", new Object[]{this, bVar});
            return;
        }
        oa4 v = v(0);
        if (v instanceof a) {
            ((a) v).c(bVar);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public void h(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161e49aa", new Object[]{this, rect});
            return;
        }
        oa4 v = v(0);
        if (v instanceof a) {
            ((a) v).h(rect);
        }
    }

    @Override // tb.oa4
    public zy9 onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("5fd8d0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.i;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1763215", new Object[]{this});
            return;
        }
        oa4 v = v(0);
        if (v instanceof a) {
            ((a) v).p();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f3814f", new Object[]{this})).booleanValue();
        }
        oa4 v = v(0);
        if (v instanceof a) {
            return ((a) v).q();
        }
        return false;
    }

    @Override // tb.qql
    public void u(oa4 oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd371740", new Object[]{this, oa4Var});
        } else if (w() < 1) {
            super.u(oa4Var);
        }
    }
}
