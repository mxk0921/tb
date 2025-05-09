package com.taobao.taolive.uikit.favor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.fkr;
import tb.frr;
import tb.o29;
import tb.o8o;
import tb.t2o;
import tb.vak;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoliveFavorComponent extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private o29 mFavorLayout;
    private TextView mFavorNum;
    private boolean mPlayFavor = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements o8o.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.o8o.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c09162bc", new Object[]{this});
            }
        }

        @Override // tb.o8o.c
        public void b(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7e369f7", new Object[]{this, arrayList});
            } else if (arrayList != null && arrayList.size() > 0 && TaoliveFavorComponent.access$000(TaoliveFavorComponent.this) != null) {
                TaoliveFavorComponent.access$000(TaoliveFavorComponent.this).setDrawables(arrayList);
            }
        }
    }

    static {
        t2o.a(779093603);
    }

    public TaoliveFavorComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        init();
    }

    public static /* synthetic */ o29 access$000(TaoliveFavorComponent taoliveFavorComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o29) ipChange.ipc$dispatch("36c0b2f9", new Object[]{taoliveFavorComponent});
        }
        return taoliveFavorComponent.mFavorLayout;
    }

    private void getFavorImgs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b1d649", new Object[]{this, str});
        } else {
            o8o.f().e(str, new a());
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (frr.x()) {
            LayoutInflater.from(this.mContext).inflate(R.layout.tbliveuikit_new_favor_component, this);
        } else {
            LayoutInflater.from(this.mContext).inflate(R.layout.tbliveuikit_favor_component, this);
        }
        this.mFavorNum = (TextView) findViewById(R.id.taolive_video_item_favor_num);
        o29 o29Var = (o29) findViewById(R.id.taolive_fake_favor);
        this.mFavorLayout = o29Var;
        o29Var.setFavorDuration(2000);
        this.mFavorLayout.setScaleFactor(0.5d);
    }

    public static /* synthetic */ Object ipc$super(TaoliveFavorComponent taoliveFavorComponent, String str, Object... objArr) {
        if (str.hashCode() == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/favor/TaoliveFavorComponent");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        o29 o29Var = this.mFavorLayout;
        if (o29Var != null) {
            o29Var.destroy();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        o29 o29Var = this.mFavorLayout;
        if (o29Var != null) {
            if (i == 8 || i == 4) {
                o29Var.stopFakeFavor();
            } else if (i == 0 && this.mPlayFavor) {
                o29Var.startFakeFavor();
            }
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        o29 o29Var = this.mFavorLayout;
        if (o29Var != null) {
            o29Var.stopFakeFavor();
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        o29 o29Var = this.mFavorLayout;
        if (o29Var != null && this.mPlayFavor) {
            o29Var.startFakeFavor();
        }
    }

    public void setFavorImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef704278", new Object[]{this, str});
        } else {
            getFavorImgs(str);
        }
    }

    public void setFavorNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e6beb2", new Object[]{this, new Integer(i)});
        } else {
            this.mFavorNum.setText(vak.a(i));
        }
    }

    public void setMaxDeviceLevel(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9713b10", new Object[]{this, new Integer(i)});
            return;
        }
        int d = fkr.d();
        if (d >= i) {
            z = false;
        }
        this.mPlayFavor = z;
        if (i != 100 && d == 0) {
            this.mPlayFavor = false;
        }
        if (!this.mPlayFavor) {
            pause();
        } else {
            resume();
        }
    }

    public TaoliveFavorComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        init();
    }

    public TaoliveFavorComponent(Context context) {
        super(context);
        this.mContext = context;
        init();
    }
}
