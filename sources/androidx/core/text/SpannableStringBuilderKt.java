package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.g1a;
import tb.pg1;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a)\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\t2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u000b\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0010\u001a-\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0010\u001a7\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a-\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0010\u001a5\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001c\u0010\u0010\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroid/text/SpannedString;", "buildSpannedString", "(Ltb/g1a;)Landroid/text/SpannedString;", "", "", "spans", "inSpans", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Ltb/g1a;)Landroid/text/SpannableStringBuilder;", pg1.ATOM_EXT_span, "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;Ltb/g1a;)Landroid/text/SpannableStringBuilder;", "bold", "(Landroid/text/SpannableStringBuilder;Ltb/g1a;)Landroid/text/SpannableStringBuilder;", "italic", pg1.ATOM_EXT_underline, "", "color", "(Landroid/text/SpannableStringBuilder;ILtb/g1a;)Landroid/text/SpannableStringBuilder;", "backgroundColor", "strikeThrough", "", "proportion", "scale", "(Landroid/text/SpannableStringBuilder;FLtb/g1a;)Landroid/text/SpannableStringBuilder;", "superscript", "subscript", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SpannableStringBuilderKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final SpannableStringBuilder backgroundColor(SpannableStringBuilder spannableStringBuilder, int i, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("ed0a6875", new Object[]{spannableStringBuilder, new Integer(i), g1aVar});
        }
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannedString buildSpannedString(g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannedString) ipChange.ipc$dispatch("db968360", new Object[]{g1aVar});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        g1aVar.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannableStringBuilder color(SpannableStringBuilder spannableStringBuilder, int i, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("d2d16883", new Object[]{spannableStringBuilder, new Integer(i), g1aVar});
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object[] objArr, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("a30a36d2", new Object[]{spannableStringBuilder, objArr, g1aVar});
        }
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder italic(SpannableStringBuilder spannableStringBuilder, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("8abffa45", new Object[]{spannableStringBuilder, g1aVar});
        }
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder scale(SpannableStringBuilder spannableStringBuilder, float f, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("930e3467", new Object[]{spannableStringBuilder, new Float(f), g1aVar});
        }
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder strikeThrough(SpannableStringBuilder spannableStringBuilder, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("51adaea2", new Object[]{spannableStringBuilder, g1aVar});
        }
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder subscript(SpannableStringBuilder spannableStringBuilder, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("1a33554a", new Object[]{spannableStringBuilder, g1aVar});
        }
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder superscript(SpannableStringBuilder spannableStringBuilder, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("3de7f02f", new Object[]{spannableStringBuilder, g1aVar});
        }
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder underline(SpannableStringBuilder spannableStringBuilder, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("c0081b29", new Object[]{spannableStringBuilder, g1aVar});
        }
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder bold(SpannableStringBuilder spannableStringBuilder, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("f8cd2810", new Object[]{spannableStringBuilder, g1aVar});
        }
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object obj, g1a<? super SpannableStringBuilder, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("144f208d", new Object[]{spannableStringBuilder, obj, g1aVar});
        }
        int length = spannableStringBuilder.length();
        g1aVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
