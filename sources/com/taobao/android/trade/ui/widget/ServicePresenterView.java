package com.taobao.android.trade.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.d2u;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ServicePresenterView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b serviceViewHelper;
    private List<a> services;
    private EllipsizedView servicesContaienr;
    private TextSizeUnit textSizeUnit;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum TextSizeUnit {
        sp(2),
        dip(1);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int unit;

        TextSizeUnit(int i) {
            this.unit = i;
        }

        public static /* synthetic */ Object ipc$super(TextSizeUnit textSizeUnit, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/widget/ServicePresenterView$TextSizeUnit");
        }

        public static TextSizeUnit toEnum(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextSizeUnit) ipChange.ipc$dispatch("4f6fc5f5", new Object[]{new Integer(i)});
            }
            if (i == 0) {
                return sp;
            }
            return dip;
        }

        public static TextSizeUnit valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextSizeUnit) ipChange.ipc$dispatch("f9e5e09c", new Object[]{str});
            }
            return (TextSizeUnit) Enum.valueOf(TextSizeUnit.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        static {
            t2o.a(724566045);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f9698a;
        public TextSizeUnit c = TextSizeUnit.sp;
        public final List<TextView> b = new ArrayList();

        static {
            t2o.a(724566046);
        }

        public b(Context context) {
            this.f9698a = context;
        }

        public final TextView a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("847ffe3c", new Object[]{this});
            }
            int a2 = d2u.a(this.f9698a, 2.0f);
            int a3 = d2u.a(this.f9698a, 1.0f);
            TextView textView = new TextView(this.f9698a);
            textView.setTextSize(this.c.unit, 10.0f);
            textView.setTextColor(-1);
            textView.setBackgroundResource(R.drawable.trade_service_bg);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine();
            textView.setPadding(a2, a3, a2, a3);
            return textView;
        }

        public final void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6af3e15d", new Object[]{this, new Integer(i)});
                return;
            }
            int size = ((ArrayList) this.b).size();
            if (i > size) {
                for (int i2 = 0; i2 < i - size; i2++) {
                    ((ArrayList) this.b).add(a());
                }
            }
        }

        public void c(List<a> list, EllipsizedView ellipsizedView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65dfb5", new Object[]{this, list, ellipsizedView});
                return;
            }
            if (ellipsizedView != null) {
                ellipsizedView.reset();
            }
            if (list != null && list.size() > 0 && ellipsizedView != null) {
                b(list.size());
                ellipsizedView.setVisibility(0);
                for (int i = 0; i < list.size(); i++) {
                    a aVar = list.get(i);
                    if (aVar != null && !TextUtils.isEmpty(null)) {
                        TextView textView = (TextView) ((ArrayList) this.b).get(i);
                        textView.setText((CharSequence) null);
                        e(textView, aVar);
                        ellipsizedView.addItemView(textView);
                    }
                }
            } else if (ellipsizedView != null) {
                ellipsizedView.setVisibility(8);
            }
        }

        public final void d(TextView textView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df970d1b", new Object[]{this, textView, new Integer(i)});
            } else if (textView != null) {
                textView.setBackgroundResource(R.drawable.trade_service_border_bg);
                GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadius(d2u.a(this.f9698a, 2.0f));
                    gradientDrawable.setStroke(d2u.a(this.f9698a, 1.0f), i);
                    gradientDrawable.setColor(0);
                }
            }
        }

        public final void e(TextView textView, a aVar) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eed253a4", new Object[]{this, textView, aVar});
                return;
            }
            int color = this.f9698a.getResources().getColor(R.color.TC_D_D);
            try {
                aVar.getClass();
                if (!TextUtils.isEmpty(null)) {
                    i = d2u.b(null, color);
                    d(textView, i);
                } else if (!TextUtils.isEmpty(null)) {
                    textView.setBackgroundResource(R.drawable.trade_service_bg);
                    GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
                    if (gradientDrawable != null) {
                        gradientDrawable.setColor(d2u.b(null, color));
                    }
                    i = -1;
                } else {
                    d(textView, color);
                    i = color;
                }
                textView.setTextColor(i);
            } catch (Exception unused) {
                textView.setTextColor(color);
                d(textView, color);
            }
        }

        public void f(TextSizeUnit textSizeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f33255a", new Object[]{this, textSizeUnit});
            } else {
                this.c = textSizeUnit;
            }
        }
    }

    static {
        t2o.a(724566044);
    }

    public ServicePresenterView(Context context) {
        this(context, null);
    }

    private void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
        } else if (!isInEditMode()) {
            if (attributeSet != null) {
                TypedArray typedArray = null;
                try {
                    typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.TradeServicePresenter);
                    this.textSizeUnit = TextSizeUnit.toEnum(typedArray.getInt(R.styleable.TradeServicePresenter_trade_text_size_unit, 0));
                    typedArray.recycle();
                } catch (Throwable th) {
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            }
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            EllipsizedView ellipsizedView = new EllipsizedView(getContext());
            this.servicesContaienr = ellipsizedView;
            addView(ellipsizedView);
            b bVar = new b(getContext());
            this.serviceViewHelper = bVar;
            bVar.f(this.textSizeUnit);
        }
    }

    public static /* synthetic */ Object ipc$super(ServicePresenterView servicePresenterView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/widget/ServicePresenterView");
    }

    public void addServices(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f029a17", new Object[]{this, list});
            return;
        }
        if (this.services == null) {
            this.services = new ArrayList();
        }
        this.services.addAll(list);
        this.serviceViewHelper.c(this.services, this.servicesContaienr);
    }

    public void clearServices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6834d2", new Object[]{this});
            return;
        }
        List<a> list = this.services;
        if (list != null && list.size() > 0) {
            this.services.clear();
            this.services = null;
        }
        this.serviceViewHelper.c(this.services, this.servicesContaienr);
    }

    public void setServices(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0ba258", new Object[]{this, list});
            return;
        }
        List<a> list2 = this.services;
        if (list2 != null) {
            list2.clear();
        }
        this.services = list;
        this.serviceViewHelper.c(list, this.servicesContaienr);
    }

    public ServicePresenterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ServicePresenterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textSizeUnit = TextSizeUnit.sp;
        init(attributeSet);
    }
}
