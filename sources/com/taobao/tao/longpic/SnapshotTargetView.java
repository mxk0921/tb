package com.taobao.tao.longpic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.longpic.ShareNewQRCodeView;
import com.taobao.taobao.R;
import com.taobao.umipublish.draft.DraftManager;
import com.ut.share.data.ShareData;
import java.util.ArrayList;
import tb.lr7;
import tb.pg1;
import tb.t2o;
import tb.vi3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SnapshotTargetView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ShareNewQRCodeView.TargetItemAdapter.c clickListener = new a();
    private Context mContext;
    private b mListener;
    private ArrayList<vi3> mNativeTargets;
    private ShareData mShareData;
    private View view;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class CenterItemLayoutManager extends LinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f12522a;
        public final int b;
        public final int c;

        static {
            t2o.a(666894516);
        }

        public CenterItemLayoutManager(Context context, int i, int i2, int i3) {
            super(context);
            this.f12522a = i;
            this.b = i2;
            this.c = i3;
        }

        public static /* synthetic */ Object ipc$super(CenterItemLayoutManager centerItemLayoutManager, String str, Object... objArr) {
            if (str.hashCode() == 286693884) {
                return new Integer(super.getPaddingLeft());
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/longpic/SnapshotTargetView$CenterItemLayoutManager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public int getPaddingLeft() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
            }
            int i = this.b * this.c;
            int i2 = this.f12522a;
            if (i >= i2) {
                return super.getPaddingLeft();
            }
            return Math.round((i2 / 2.0f) - (i / 2.0f));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public int getPaddingRight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
            }
            return getPaddingLeft();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ShareNewQRCodeView.TargetItemAdapter.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.tao.longpic.ShareNewQRCodeView.TargetItemAdapter.c
        public void a(vi3 vi3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8267751f", new Object[]{this, vi3Var});
            } else if (SnapshotTargetView.access$000(SnapshotTargetView.this) != null) {
                SnapshotTargetView.access$000(SnapshotTargetView.this).a(vi3Var.k(), SnapshotTargetView.access$100(SnapshotTargetView.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(String str, ShareData shareData);
    }

    static {
        t2o.a(666894514);
    }

    public SnapshotTargetView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }

    public static /* synthetic */ b access$000(SnapshotTargetView snapshotTargetView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("97f32310", new Object[]{snapshotTargetView});
        }
        return snapshotTargetView.mListener;
    }

    public static /* synthetic */ ShareData access$100(SnapshotTargetView snapshotTargetView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareData) ipChange.ipc$dispatch("95fb1669", new Object[]{snapshotTargetView});
        }
        return snapshotTargetView.mShareData;
    }

    private int getWindowWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ca3e2fa", new Object[]{this})).intValue();
        }
        return ((WindowManager) this.mContext.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.share_snapshot_target_view, this);
    }

    public static /* synthetic */ Object ipc$super(SnapshotTargetView snapshotTargetView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/longpic/SnapshotTargetView");
    }

    private void showView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146cd6c9", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.snapshot_target_native);
        ArrayList<vi3> arrayList = this.mNativeTargets;
        if (arrayList == null || arrayList.size() <= 0) {
            recyclerView.setVisibility(8);
            return;
        }
        recyclerView.removeAllViews();
        CenterItemLayoutManager centerItemLayoutManager = new CenterItemLayoutManager(this.mContext.getApplicationContext(), getWindowWidth(), lr7.b(this.mContext, 69.0f), this.mNativeTargets.size());
        centerItemLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(centerItemLayoutManager);
        ShareNewQRCodeView.TargetItemAdapter targetItemAdapter = new ShareNewQRCodeView.TargetItemAdapter(this.mContext.getApplicationContext(), this.mNativeTargets);
        recyclerView.setAdapter(targetItemAdapter);
        targetItemAdapter.P(this.clickListener);
        recyclerView.setVisibility(0);
    }

    public void setData(b bVar, ArrayList<vi3> arrayList, ShareData shareData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e837d5b7", new Object[]{this, bVar, arrayList, shareData, new Boolean(z)});
        } else if (bVar != null) {
            this.mListener = bVar;
            this.mNativeTargets = arrayList;
            this.mShareData = shareData;
            if (z) {
                vi3 vi3Var = new vi3();
                vi3Var.o(R.string.uik_icon_down);
                vi3Var.y(1);
                vi3Var.s(Localization.q(R.string.share_app_save));
                vi3Var.x(DraftManager.ACTION_TYPE_SAVE);
                vi3Var.p(-1);
                this.mNativeTargets.add(vi3Var);
            }
            showView();
        }
    }

    public SnapshotTargetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public SnapshotTargetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public SnapshotTargetView(Context context) {
        super(context);
        init(context);
    }

    public void setData(b bVar, ArrayList<vi3> arrayList, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeb774bd", new Object[]{this, bVar, arrayList, shareData});
        } else {
            setData(bVar, arrayList, shareData, true);
        }
    }
}
