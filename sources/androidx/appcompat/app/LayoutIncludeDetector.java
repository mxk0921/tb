package androidx.appcompat.app;

import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LayoutIncludeDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Deque<WeakReference<XmlPullParser>> mXmlParserStack = new ArrayDeque();

    private static boolean isParserOutdated(XmlPullParser xmlPullParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1d1ac26", new Object[]{xmlPullParser})).booleanValue();
        }
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3) {
                    if (xmlPullParser.getEventType() != 1) {
                        return false;
                    }
                }
            } catch (XmlPullParserException unused) {
                return true;
            }
        }
        return true;
    }

    private static XmlPullParser popOutdatedAttrHolders(Deque<WeakReference<XmlPullParser>> deque) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlPullParser) ipChange.ipc$dispatch("3a2ef6a3", new Object[]{deque});
        }
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!isParserOutdated(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    public boolean detect(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f6f7428", new Object[]{this, attributeSet})).booleanValue();
        }
        if (attributeSet instanceof XmlPullParser) {
            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
            if (xmlPullParser.getDepth() == 1) {
                XmlPullParser popOutdatedAttrHolders = popOutdatedAttrHolders(this.mXmlParserStack);
                this.mXmlParserStack.push(new WeakReference<>(xmlPullParser));
                if (shouldInheritContext(xmlPullParser, popOutdatedAttrHolders)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean shouldInheritContext(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf64a5a6", new Object[]{xmlPullParser, xmlPullParser2})).booleanValue();
        }
        if (!(xmlPullParser2 == null || xmlPullParser == xmlPullParser2)) {
            try {
                if (xmlPullParser2.getEventType() == 2) {
                    return SmartLandingTask.Operation.STR_INCLUDE.equals(xmlPullParser2.getName());
                }
            } catch (XmlPullParserException unused) {
            }
        }
        return false;
    }
}
