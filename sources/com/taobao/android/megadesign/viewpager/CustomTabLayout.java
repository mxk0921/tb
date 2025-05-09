package com.taobao.android.megadesign.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.nuo;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\fJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\fR\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/taobao/android/megadesign/viewpager/CustomTabLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "index", "Ltb/xhv;", nuo.MSG_SELECT_TAB, "(I)V", "", "title", "addTab", "(Ljava/lang/String;)V", "Landroid/view/View;", "tabView", "(Landroid/view/View;)V", "Landroidx/viewpager/widget/ViewPager;", OrderConfigs.VIEWPAGER, "setupWithViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "Lcom/taobao/android/megadesign/viewpager/CustomTabLayout$a;", DataReceiveMonitor.CB_LISTENER, "setOnTabClickListener", "(Lcom/taobao/android/megadesign/viewpager/CustomTabLayout$a;)V", "setTabIndex", "setInitTabIndex", "mSelectedTabIndex", TLogTracker.LEVEL_INFO, "mInitTabIndex", "", "mTabs", "Ljava/util/List;", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "mTabClickListener", "Lcom/taobao/android/megadesign/viewpager/CustomTabLayout$a;", "a", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class CustomTabLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mInitTabIndex;
    private a mTabClickListener;
    private ViewPager mViewPager;
    private int mSelectedTabIndex = -1;
    private final List<View> mTabs = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(int i, int i2);

        void b(int i, View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CustomTabLayout customTabLayout = CustomTabLayout.this;
            CustomTabLayout.access$selectTab(customTabLayout, CustomTabLayout.access$getMTabs$p(customTabLayout).indexOf(this.b));
            a access$getMTabClickListener$p = CustomTabLayout.access$getMTabClickListener$p(CustomTabLayout.this);
            if (access$getMTabClickListener$p != null) {
                int indexOf = CustomTabLayout.access$getMTabs$p(CustomTabLayout.this).indexOf(this.b);
                View view2 = this.b;
                ckf.f(view2, "tabView");
                access$getMTabClickListener$p.b(indexOf, view2);
            }
            ViewPager access$getMViewPager$p = CustomTabLayout.access$getMViewPager$p(CustomTabLayout.this);
            if (access$getMViewPager$p != null) {
                access$getMViewPager$p.setCurrentItem(CustomTabLayout.access$getMTabs$p(CustomTabLayout.this).indexOf(this.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public c(View view) {
            this.b = view;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CustomTabLayout customTabLayout = CustomTabLayout.this;
            CustomTabLayout.access$selectTab(customTabLayout, CustomTabLayout.access$getMTabs$p(customTabLayout).indexOf(this.b));
            a access$getMTabClickListener$p = CustomTabLayout.access$getMTabClickListener$p(CustomTabLayout.this);
            if (access$getMTabClickListener$p != null) {
                access$getMTabClickListener$p.b(CustomTabLayout.access$getMTabs$p(CustomTabLayout.this).indexOf(this.b), this.b);
            }
            ViewPager access$getMViewPager$p = CustomTabLayout.access$getMViewPager$p(CustomTabLayout.this);
            if (access$getMViewPager$p != null) {
                access$getMViewPager$p.setCurrentItem(CustomTabLayout.access$getMTabs$p(CustomTabLayout.this).indexOf(this.b));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        ckf.g(attributeSet, "attrs");
        setOrientation(0);
    }

    public static final /* synthetic */ a access$getMTabClickListener$p(CustomTabLayout customTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5289352d", new Object[]{customTabLayout});
        }
        return customTabLayout.mTabClickListener;
    }

    public static final /* synthetic */ List access$getMTabs$p(CustomTabLayout customTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8661cb3f", new Object[]{customTabLayout});
        }
        return customTabLayout.mTabs;
    }

    public static final /* synthetic */ ViewPager access$getMViewPager$p(CustomTabLayout customTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("9c8e9ddd", new Object[]{customTabLayout});
        }
        return customTabLayout.mViewPager;
    }

    public static final /* synthetic */ void access$selectTab(CustomTabLayout customTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaccdb13", new Object[]{customTabLayout, new Integer(i)});
        } else {
            customTabLayout.selectTab(i);
        }
    }

    public static final /* synthetic */ void access$setMTabClickListener$p(CustomTabLayout customTabLayout, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57046b41", new Object[]{customTabLayout, aVar});
        } else {
            customTabLayout.mTabClickListener = aVar;
        }
    }

    public static final /* synthetic */ void access$setMViewPager$p(CustomTabLayout customTabLayout, ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c925334d", new Object[]{customTabLayout, viewPager});
        } else {
            customTabLayout.mViewPager = viewPager;
        }
    }

    public static /* synthetic */ Object ipc$super(CustomTabLayout customTabLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/viewpager/CustomTabLayout");
    }

    private final void selectTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffde1203", new Object[]{this, new Integer(i)});
        } else if (i != this.mSelectedTabIndex && !this.mTabs.isEmpty()) {
            a aVar = this.mTabClickListener;
            if (aVar != null) {
                aVar.a(i, this.mSelectedTabIndex);
            }
            int i2 = this.mSelectedTabIndex;
            if (i2 != -1) {
                ((TextView) this.mTabs.get(i2).findViewById(R.id.tab_item_text)).setTextColor(ContextCompat.getColor(getContext(), R.color.tb_text_secondary2));
            }
            this.mSelectedTabIndex = i;
            ((TextView) this.mTabs.get(i).findViewById(R.id.tab_item_text)).setTextColor(ContextCompat.getColor(getContext(), R.color.tb_text_primary));
        }
    }

    public final void addTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760b1ac5", new Object[]{this, str});
            return;
        }
        ckf.g(str, "title");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.custom_tab_item, (ViewGroup) this, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tab_item_text);
        ckf.f(textView, "tabText");
        textView.setText(str);
        ViewProxy.setOnClickListener(inflate, new b(inflate));
        addView(inflate);
        this.mTabs.add(inflate);
    }

    public final void setInitTabIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320107cd", new Object[]{this, new Integer(i)});
        } else {
            this.mInitTabIndex = i;
        }
    }

    public final void setOnTabClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53efbb65", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.mTabClickListener = aVar;
    }

    public final void setTabIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf611fd", new Object[]{this, new Integer(i)});
            return;
        }
        int size = this.mTabs.size();
        if (i >= 0 && size > i) {
            selectTab(i);
            ViewPager viewPager = this.mViewPager;
            if (viewPager != null) {
                viewPager.setCurrentItem(i);
                return;
            }
            return;
        }
        selectTab(0);
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243f2d35", new Object[]{this, viewPager});
            return;
        }
        this.mViewPager = viewPager;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.megadesign.viewpager.CustomTabLayout$setupWithViewPager$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    } else {
                        CustomTabLayout.access$selectTab(CustomTabLayout.this, i);
                    }
                }
            });
        }
        if (this.mSelectedTabIndex == -1 && this.mInitTabIndex == 0) {
            setTabIndex(0);
        } else {
            setTabIndex(this.mInitTabIndex);
        }
    }

    public final void addTab(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f36e737", new Object[]{this, view});
            return;
        }
        ckf.g(view, "tabView");
        ViewProxy.setOnClickListener(view, new c(view));
        addView(view);
        this.mTabs.add(view);
    }
}
