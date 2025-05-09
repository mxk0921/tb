package androidx.core.text.util;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.text.util.LinkifyCompat;
import androidx.core.util.PatternsCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LinkifyCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[] EMPTY_STRING = new String[0];
    private static final Comparator<LinkSpec> COMPARATOR = new Comparator() { // from class: tb.xsg
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int lambda$static$0;
            lambda$static$0 = LinkifyCompat.lambda$static$0((LinkifyCompat.LinkSpec) obj, (LinkifyCompat.LinkSpec) obj2);
            return lambda$static$0;
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static void addLinks(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85bb1afa", new Object[]{textView, pattern, str, strArr, matchFilter, transformFilter});
            } else {
                Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
            }
        }

        public static boolean addLinks(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a43be6b", new Object[]{spannable, pattern, str, strArr, matchFilter, transformFilter})).booleanValue() : Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class LinkSpec {
        public int end;
        public URLSpan frameworkAddedSpan;
        public int start;
        public String url;
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface LinkifyMask {
    }

    private LinkifyCompat() {
    }

    private static void addLinkMovementMethod(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688e5bf2", new Object[]{textView});
        } else if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static boolean addLinks(Spannable spannable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176fb8d5", new Object[]{spannable, new Integer(i)})).booleanValue();
        }
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            gatherLinks(arrayList, spannable, PatternsCompat.AUTOLINK_WEB_URL, new String[]{h1p.HTTP_PREFIX, h1p.HTTPS_PREFIX, "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((2 & i) != 0) {
            gatherLinks(arrayList, spannable, PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new String[]{"mailto:"}, null, null);
        }
        if ((i & 8) != 0) {
            gatherMapLinks(arrayList, spannable);
        }
        pruneOverlaps(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LinkSpec linkSpec = (LinkSpec) it.next();
            if (linkSpec.frameworkAddedSpan == null) {
                applyLink(linkSpec.url, linkSpec.start, linkSpec.end, spannable);
            }
        }
        return true;
    }

    private static void applyLink(String str, int i, int i2, Spannable spannable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ee18c", new Object[]{str, new Integer(i), new Integer(i2), spannable});
        } else {
            spannable.setSpan(new URLSpan(str), i, i2, 33);
        }
    }

    private static String findAddress(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc63cdd4", new Object[]{str});
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return FindAddress.findAddress(str);
    }

    private static void gatherLinks(ArrayList<LinkSpec> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ce2457", new Object[]{arrayList, spannable, pattern, strArr, matchFilter, transformFilter});
            return;
        }
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    LinkSpec linkSpec = new LinkSpec();
                    linkSpec.url = makeUrl(group, strArr, matcher, transformFilter);
                    linkSpec.start = start;
                    linkSpec.end = end;
                    arrayList.add(linkSpec);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(LinkSpec linkSpec, LinkSpec linkSpec2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("971ef6bb", new Object[]{linkSpec, linkSpec2})).intValue();
        }
        int i = linkSpec.start;
        int i2 = linkSpec2.start;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(linkSpec2.end, linkSpec.end);
    }

    private static String makeUrl(String str, String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57678740", new Object[]{str, strArr, matcher, transformFilter});
        }
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            if (!str.regionMatches(true, 0, str2, 0, str2.length())) {
                i++;
            } else if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                str = str2 + str.substring(str2.length());
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    private static void pruneOverlaps(ArrayList<LinkSpec> arrayList, Spannable spannable) {
        URLSpan[] uRLSpanArr;
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c911fc0", new Object[]{arrayList, spannable});
            return;
        }
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            LinkSpec linkSpec = new LinkSpec();
            linkSpec.frameworkAddedSpan = uRLSpan;
            linkSpec.start = spannable.getSpanStart(uRLSpan);
            linkSpec.end = spannable.getSpanEnd(uRLSpan);
            arrayList.add(linkSpec);
        }
        Collections.sort(arrayList, COMPARATOR);
        int size = arrayList.size();
        while (i3 < size - 1) {
            LinkSpec linkSpec2 = arrayList.get(i3);
            int i4 = i3 + 1;
            LinkSpec linkSpec3 = arrayList.get(i4);
            int i5 = linkSpec2.start;
            int i6 = linkSpec3.start;
            if (i5 <= i6 && (i = linkSpec2.end) > i6) {
                int i7 = linkSpec3.end;
                if (i7 <= i || i - i5 > i7 - i6) {
                    i2 = i4;
                } else if (i - i5 < i7 - i6) {
                    i2 = i3;
                } else {
                    i2 = -1;
                }
                if (i2 != -1) {
                    URLSpan uRLSpan2 = arrayList.get(i2).frameworkAddedSpan;
                    if (uRLSpan2 != null) {
                        spannable.removeSpan(uRLSpan2);
                    }
                    arrayList.remove(i2);
                    size--;
                }
            }
            i3 = i4;
        }
    }

    private static boolean shouldAddLinksFallbackToFramework() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cffe4ea1", new Object[0])).booleanValue();
        }
        return Build.VERSION.SDK_INT >= 28;
    }

    private static void gatherMapLinks(ArrayList<LinkSpec> arrayList, Spannable spannable) {
        int indexOf;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508cdffe", new Object[]{arrayList, spannable});
            return;
        }
        String obj = spannable.toString();
        while (true) {
            try {
                String findAddress = findAddress(obj);
                if (findAddress != null && (indexOf = obj.indexOf(findAddress)) >= 0) {
                    LinkSpec linkSpec = new LinkSpec();
                    int length = findAddress.length() + indexOf;
                    linkSpec.start = indexOf + i;
                    i += length;
                    linkSpec.end = i;
                    obj = obj.substring(length);
                    try {
                        String encode = URLEncoder.encode(findAddress, "UTF-8");
                        linkSpec.url = "geo:0,0?q=" + encode;
                        arrayList.add(linkSpec);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    public static boolean addLinks(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84a4f8a2", new Object[]{textView, new Integer(i)})).booleanValue();
        }
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (addLinks(valueOf, i)) {
                addLinkMovementMethod(textView);
                textView.setText(valueOf);
                return true;
            }
        } else if (addLinks((Spannable) text, i)) {
            addLinkMovementMethod(textView);
            return true;
        }
        return false;
    }

    public static void addLinks(TextView textView, Pattern pattern, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e95dbe", new Object[]{textView, pattern, str});
        } else if (shouldAddLinksFallbackToFramework()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            addLinks(textView, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
    }

    public static void addLinks(TextView textView, Pattern pattern, String str, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462780d7", new Object[]{textView, pattern, str, matchFilter, transformFilter});
        } else if (shouldAddLinksFallbackToFramework()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            addLinks(textView, pattern, str, (String[]) null, matchFilter, transformFilter);
        }
    }

    public static void addLinks(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bb1afa", new Object[]{textView, pattern, str, strArr, matchFilter, transformFilter});
        } else if (shouldAddLinksFallbackToFramework()) {
            Api24Impl.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        } else {
            SpannableString valueOf = SpannableString.valueOf(textView.getText());
            if (addLinks(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
                textView.setText(valueOf);
                addLinkMovementMethod(textView);
            }
        }
    }

    public static boolean addLinks(Spannable spannable, Pattern pattern, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd4d2e35", new Object[]{spannable, pattern, str})).booleanValue();
        }
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return addLinks(spannable, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    public static boolean addLinks(Spannable spannable, Pattern pattern, String str, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e5a228e", new Object[]{spannable, pattern, str, matchFilter, transformFilter})).booleanValue();
        }
        if (shouldAddLinksFallbackToFramework()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return addLinks(spannable, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    public static boolean addLinks(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a43be6b", new Object[]{spannable, pattern, str, strArr, matchFilter, transformFilter})).booleanValue();
        }
        if (shouldAddLinksFallbackToFramework()) {
            return Api24Impl.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = EMPTY_STRING;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str3 = strArr[i];
            i++;
            if (str3 == null) {
                str2 = "";
            } else {
                str2 = str3.toLowerCase(Locale.ROOT);
            }
            strArr2[i] = str2;
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) && group != null) {
                applyLink(makeUrl(group, strArr2, matcher, transformFilter), start, end, spannable);
                z = true;
            }
        }
        return z;
    }
}
