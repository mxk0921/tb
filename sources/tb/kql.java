package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Set<String> a(Uri uri) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ea011e", new Object[]{uri});
        }
        if (!uri.isOpaque()) {
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return Collections.emptySet();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            return Collections.unmodifiableSet(linkedHashSet);
        }
        throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    }

    public static HashMap<String, String> b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fc1691bb", new Object[]{intent});
        }
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        return c(data);
    }

    public static HashMap<String, String> c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("536b9f95", new Object[]{uri});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Set<String> a2 = a(uri);
        if (a2 == null || a2.isEmpty()) {
            return null;
        }
        for (String str : a2) {
            String queryParameter = uri.getQueryParameter(str);
            if (!(str == null || queryParameter == null)) {
                hashMap.put(str, queryParameter);
            }
        }
        return hashMap;
    }
}
