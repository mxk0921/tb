package com.taobao.android.litecreator.base.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.a65;
import tb.pbg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LCTabView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<b> mItemList = new ArrayList();
    public c mOnTabChangeListener;
    public ViewGroup mTabItemContainer;
    public View mTabSlider;
    public Animator mTabSwitchAnim;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f8241a;

        public a(b bVar) {
            this.f8241a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            LCTabView.this.performTabClicked(this.f8241a.f8242a, true);
            LCTabView.this.playSliderAnim(this.f8241a.f8242a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f8242a;
        public final String b;
        public boolean c;

        static {
            t2o.a(511705148);
        }

        public b(int i, String str) {
            this.f8242a = i;
            this.b = str;
        }

        public abstract View a(ViewGroup viewGroup);

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public abstract void c(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(int i, boolean z);
    }

    static {
        t2o.a(511705146);
    }

    public LCTabView(Context context) {
        super(context);
        initialize();
    }

    private void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        int rootViewId = rootViewId();
        if (rootViewId != -1) {
            LayoutInflater.from(getContext()).inflate(rootViewId, this);
        }
        this.mTabSlider = findViewById(sliderId());
        this.mTabItemContainer = (ViewGroup) findViewById(tabViewId());
    }

    public static /* synthetic */ Object ipc$super(LCTabView lCTabView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/base/widget/LCTabView");
    }

    public void addTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760b1ac5", new Object[]{this, str});
        } else {
            addTab(new com.taobao.android.litecreator.base.widget.a(this.mItemList.size(), str));
        }
    }

    public int getFocused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e8ac33b", new Object[]{this})).intValue();
        }
        for (b bVar : this.mItemList) {
            if (bVar.b()) {
                return bVar.f8242a;
            }
        }
        return -1;
    }

    public ViewGroup getTabItemContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1c8943bf", new Object[]{this});
        }
        return this.mTabItemContainer;
    }

    public boolean isItemChecked(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65af47c", new Object[]{this, bVar, new Integer(i)})).booleanValue();
        }
        if (bVar.f8242a == i) {
            return true;
        }
        return false;
    }

    public void performTabClicked(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c629cb", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        for (b bVar : this.mItemList) {
            if (!isItemChecked(bVar, i)) {
                if (bVar.b()) {
                    bVar.c = false;
                    bVar.c(false);
                }
            } else if (!bVar.b()) {
                bVar.c = true;
                bVar.c(true);
                c cVar = this.mOnTabChangeListener;
                if (cVar != null) {
                    cVar.a(i, z);
                }
            }
        }
    }

    public void playSliderAnim(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95565236", new Object[]{this, new Integer(i)});
            return;
        }
        Animator animator = this.mTabSwitchAnim;
        if (animator != null && animator.isRunning()) {
            this.mTabSwitchAnim.cancel();
        }
        Animator generateSliderAnimByIndex = generateSliderAnimByIndex(this.mTabSlider, i);
        this.mTabSwitchAnim = generateSliderAnimByIndex;
        if (generateSliderAnimByIndex != null) {
            generateSliderAnimByIndex.setDuration(200L);
            this.mTabSwitchAnim.setInterpolator(new AccelerateDecelerateInterpolator());
            this.mTabSwitchAnim.start();
        }
    }

    public int rootViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2fd8d9c", new Object[]{this})).intValue();
        }
        return R.layout.lay_lc_mediapick_tab;
    }

    public void setFocused(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91713c7", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.mItemList.size()) {
            performTabClicked(i, false);
            playSliderAnim(i);
        }
    }

    public void setOnTabChangeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8890ae6", new Object[]{this, cVar});
        } else {
            this.mOnTabChangeListener = cVar;
        }
    }

    public int sliderId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ea90456", new Object[]{this})).intValue();
        }
        return R.id.v_tab_slider;
    }

    public int tabViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2fd488f", new Object[]{this})).intValue();
        }
        return R.id.rg_mediaptype_tab;
    }

    public void addTab(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182fed01", new Object[]{this, bVar});
            return;
        }
        pbg.a("LCTabView.Item.createView");
        View a2 = bVar.a(this.mTabItemContainer);
        pbg.c();
        ViewProxy.setOnClickListener(a2, new a(bVar));
        this.mItemList.add(bVar);
        this.mTabItemContainer.addView(a2);
    }

    public LCTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    public Animator generateSliderAnimByIndex(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("39d12e27", new Object[]{this, view, new Integer(i)});
        }
        return ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), a65.a(70.0f) * i);
    }

    public LCTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize();
    }
}
