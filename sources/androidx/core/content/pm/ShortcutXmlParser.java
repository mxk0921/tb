package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ShortcutXmlParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_SHORTCUT_ID = "shortcutId";
    private static final Object GET_INSTANCE_LOCK = new Object();
    private static final String META_DATA_APP_SHORTCUTS = "android.app.shortcuts";
    private static final String TAG = "ShortcutXmlParser";
    private static final String TAG_SHORTCUT = "shortcut";
    private static volatile ArrayList<String> sShortcutIds;

    private ShortcutXmlParser() {
    }

    private static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f5658ba", new Object[]{xmlPullParser, str});
        }
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static List<String> getShortcutIds(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2d2ab062", new Object[]{context});
        }
        if (sShortcutIds == null) {
            synchronized (GET_INSTANCE_LOCK) {
                try {
                    if (sShortcutIds == null) {
                        sShortcutIds = new ArrayList<>();
                        sShortcutIds.addAll(parseShortcutIds(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sShortcutIds;
    }

    private static XmlResourceParser getXmlResourceParser(Context context, ActivityInfo activityInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("e7000927", new Object[]{context, activityInfo});
        }
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_APP_SHORTCUTS);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    private static Set<String> parseShortcutIds(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("12019211", new Object[]{context});
        }
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (!(queryIntentActivities == null || queryIntentActivities.size() == 0)) {
            try {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(META_DATA_APP_SHORTCUTS)) {
                        XmlResourceParser xmlResourceParser = getXmlResourceParser(context, activityInfo);
                        hashSet.addAll(parseShortcutIds(xmlResourceParser));
                        if (xmlResourceParser != null) {
                            xmlResourceParser.close();
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, "Failed to parse the Xml resource: ", e);
            }
        }
        return hashSet;
    }

    public static List<String> parseShortcutIds(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String attributeValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bb6a9cb7", new Object[]{xmlPullParser});
        }
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && "shortcut".equals(name) && (attributeValue = getAttributeValue(xmlPullParser, ATTR_SHORTCUT_ID)) != null) {
                arrayList.add(attributeValue);
            }
        }
        return arrayList;
    }
}
