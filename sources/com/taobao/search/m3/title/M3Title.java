package com.taobao.search.m3.title;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import com.taobao.search.searchdoor.sf.config.TbSearchStyleCard;
import com.taobao.search.searchdoor.sf.config.TbSearchStyleCommon;
import java.util.ArrayList;
import java.util.Iterator;
import tb.a07;
import tb.ckf;
import tb.eh3;
import tb.hnh;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class M3Title extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final int iconHeight = o1p.a(14.0f);
    private static final int clickedColor = Color.parseColor("#999999");
    private static final int normalColor = Color.parseColor("#333333");
    private static final float defaultTs = o1p.a(15.0f);
    private final ArrayList<hnh> icons = new ArrayList<>(1);
    private int currentNormalColor = normalColor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792462);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792461);
    }

    public M3Title(Context context) {
        super(context);
        setTextSize(0, defaultTs);
        setLineSpacing(o1p.a(1.0f), 1.0f);
    }

    public static final /* synthetic */ int access$getClickedColor$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5cff899", new Object[0])).intValue();
        }
        return clickedColor;
    }

    public static final /* synthetic */ int access$getIconHeight$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10532b15", new Object[0])).intValue();
        }
        return iconHeight;
    }

    public static final /* synthetic */ int access$getNormalColor$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75f99405", new Object[0])).intValue();
        }
        return normalColor;
    }

    public static /* synthetic */ Object ipc$super(M3Title m3Title, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/title/M3Title");
        }
    }

    private final void releaseIcons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d58ca5a", new Object[]{this});
            return;
        }
        Iterator<hnh> it = this.icons.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            hnh next = it.next();
            ckf.f(next, "next(...)");
            next.f();
        }
        this.icons.clear();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Iterator<hnh> it = this.icons.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            hnh next = it.next();
            ckf.f(next, "next(...)");
            next.e();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseIcons();
    }

    public final void update(SearchDomBean searchDomBean, String str, boolean z, int i, boolean z2, TbSearchStyle tbSearchStyle) {
        float f;
        int i2;
        boolean z3;
        int i3;
        TbSearchStyleCard tbSearchStyleCard;
        TbSearchStyleCommon tbSearchStyleCommon;
        TbSearchStyleCard tbSearchStyleCard2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7ea5df", new Object[]{this, searchDomBean, str, new Boolean(z), new Integer(i), new Boolean(z2), tbSearchStyle});
            return;
        }
        if (tbSearchStyle == null || (tbSearchStyleCard2 = tbSearchStyle.card) == null) {
            f = defaultTs;
        } else {
            f = tbSearchStyleCard2.titleTextSize;
        }
        setTextSize(0, f);
        if (tbSearchStyle == null || (tbSearchStyleCommon = tbSearchStyle.common) == null) {
            i2 = normalColor;
        } else {
            i2 = tbSearchStyleCommon.mainTextColor;
        }
        this.currentNormalColor = i2;
        setMaxLines(i);
        TextPaint paint = getPaint();
        if (tbSearchStyle == null || (tbSearchStyleCard = tbSearchStyle.card) == null) {
            z3 = false;
        } else {
            z3 = tbSearchStyleCard.titleBold;
        }
        paint.setFakeBoldText(z3);
        if (z2) {
            setLines(i);
        }
        releaseIcons();
        if (z) {
            i3 = clickedColor;
        } else {
            i3 = this.currentNormalColor;
        }
        setTextColor(i3);
        if (searchDomBean == null) {
            setText(str);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) " ");
        Context context = getContext();
        ckf.f(context, "getContext(...)");
        hnh hnhVar = new hnh(searchDomBean, context, iconHeight);
        hnhVar.setCallback(this);
        hnhVar.e();
        spannableStringBuilder.setSpan(new eh3(hnhVar), 0, 1, 33);
        this.icons.add(hnhVar);
        if (str != null) {
            spannableStringBuilder.append((CharSequence) str);
        }
        setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }
}
