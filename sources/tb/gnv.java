package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class gnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, List<ExperimentV5>> f20118a = new ConcurrentHashMap<>();
    public final List<ExperimentV5> b = new ArrayList();
    public final Object c = new Object();
    public final Object d = new Object();

    static {
        t2o.a(961544333);
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50e2fae6", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.indexOf(str, "UTABTEST-ANY") != -1) {
            return true;
        }
        return false;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d11580e9", new Object[]{this, str});
        }
        return str.substring(13, str.length() - 13);
    }

    public boolean c(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b1f118", new Object[]{this, uri, uri2})).booleanValue();
        }
        if (uri == uri2) {
            return true;
        }
        if (uri == null || uri2 == null || !d(uri, uri2)) {
            return false;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return true;
        }
        if (!uri2.getQueryParameterNames().containsAll(queryParameterNames)) {
            return false;
        }
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter) && !"UTABTEST-REG()UTABTEST-REG".equals(queryParameter)) {
                String queryParameter2 = uri2.getQueryParameter(str);
                if (!n.j().a().N() || !i(queryParameter) || TextUtils.isEmpty(queryParameter2) || !queryParameter2.matches(b(queryParameter))) {
                    if (!TextUtils.equals(queryParameter, queryParameter2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean d(Uri uri, Uri uri2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7624ef1d", new Object[]{this, uri, uri2})).booleanValue();
        }
        String g = g(uri, "");
        String g2 = g(uri2, "");
        if (!a(g)) {
            return TextUtils.equals(g, g2);
        }
        String[] split = TextUtils.split(g, "/");
        String[] split2 = TextUtils.split(g2, "/");
        if (split == null) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i < split.length && i3 < 50; i3++) {
            String str2 = split[i];
            String str3 = null;
            if (split2 == null || i2 >= split2.length) {
                str = null;
            } else {
                str = split2[i2];
            }
            boolean equals = TextUtils.equals(str2, "UTABTEST-ANY");
            if (str == null) {
                if (equals) {
                    if (i == split.length - 1) {
                        return true;
                    }
                } else if (TextUtils.isEmpty(str2) && i == split.length - 1) {
                    return true;
                } else {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                }
                i++;
            } else {
                if (equals) {
                    int i4 = i + 1;
                    if (i4 < split.length) {
                        str3 = split[i4];
                    }
                    if (str3 != null && TextUtils.equals(str3, str)) {
                        i += 2;
                    }
                } else if (!TextUtils.equals(str2, str)) {
                    return false;
                } else {
                    i++;
                }
                i2++;
            }
        }
        if (i2 >= split2.length - 1) {
            return true;
        }
        while (i2 < split2.length) {
            if (!TextUtils.isEmpty(split2[i2])) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public ExperimentV5 e(long j) {
        List<ExperimentGroupV5> groups;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("cc478c1f", new Object[]{this, new Long(j)});
        }
        synchronized (this.c) {
            try {
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ExperimentV5 experimentV5 = (ExperimentV5) it.next();
                    List<ExperimentGroupV5> groups2 = experimentV5.getGroups();
                    if (groups2 != null) {
                        for (ExperimentGroupV5 experimentGroupV5 : groups2) {
                            if (experimentGroupV5.getId() == j) {
                                return experimentV5;
                            }
                        }
                        continue;
                    }
                }
                for (List<ExperimentV5> list : this.f20118a.values()) {
                    if (list != null) {
                        for (ExperimentV5 experimentV52 : list) {
                            if (!(experimentV52 == null || (groups = experimentV52.getGroups()) == null)) {
                                for (ExperimentGroupV5 experimentGroupV52 : groups) {
                                    if (experimentGroupV52.getId() == j) {
                                        return experimentV52;
                                    }
                                }
                                continue;
                            }
                        }
                        continue;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<ExperimentV5> f(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d768eafd", new Object[]{this, uri});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.c) {
            try {
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ExperimentV5 experimentV5 = (ExperimentV5) it.next();
                    if (c(experimentV5.getUri(), uri)) {
                        arrayList2.add(experimentV5);
                    }
                }
            } finally {
            }
        }
        if (arrayList2.size() > 0) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ExperimentV5 experimentV52 = (ExperimentV5) it2.next();
                if (experimentV52.getType() == ExperimentType.Redirect) {
                    ExperimentV5 h = h(experimentV52, uri);
                    if (h != null) {
                        arrayList.add(h);
                    }
                } else {
                    arrayList.add(experimentV52);
                }
            }
        }
        List<ExperimentV5> list = this.f20118a.get(g(uri, "<PATH-EMPTY>"));
        if (list != null && !list.isEmpty()) {
            synchronized (list) {
                try {
                    for (ExperimentV5 experimentV53 : list) {
                        if (c(experimentV53.getUri(), uri)) {
                            if (experimentV53.getType() == ExperimentType.Redirect) {
                                ExperimentV5 h2 = h(experimentV53, uri);
                                if (h2 != null) {
                                    arrayList.add(h2);
                                }
                            } else {
                                arrayList.add(experimentV53);
                            }
                        }
                    }
                } finally {
                }
            }
        }
        return arrayList;
    }

    public final String g(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c1faf1", new Object[]{this, uri, str});
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return str;
        }
        return path;
    }

    public final ExperimentV5 h(ExperimentV5 experimentV5, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("9994796d", new Object[]{this, experimentV5, uri});
        }
        for (ExperimentGroupV5 experimentGroupV5 : experimentV5.getGroups()) {
            if (!(experimentGroupV5.getIgnoreUris() == null || experimentGroupV5.getIgnoreUris().isEmpty())) {
                ArrayList arrayList = new ArrayList();
                for (ExperimentGroupV5 experimentGroupV52 : experimentV5.getGroups()) {
                    if (experimentGroupV52.getIgnoreUris() != null && !experimentGroupV52.getIgnoreUris().isEmpty()) {
                        Iterator<Uri> it = experimentGroupV52.getIgnoreUris().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (c(it.next(), uri)) {
                                    break;
                                }
                            } else {
                                arrayList.add(experimentGroupV52);
                                break;
                            }
                        }
                    } else {
                        arrayList.add(experimentGroupV52);
                    }
                }
                if (arrayList.size() <= 0) {
                    return null;
                }
                if (arrayList.size() == experimentV5.getGroups().size()) {
                    return experimentV5;
                }
                ExperimentV5 copyBasicInfo = experimentV5.copyBasicInfo();
                copyBasicInfo.setGroups(arrayList);
                return copyBasicInfo;
            }
        }
        return experimentV5;
    }

    public final boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51f6a7e5", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("UTABTEST-REG(") || !str.endsWith(")UTABTEST-REG")) {
            return false;
        }
        return true;
    }

    public void j(Uri uri, ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbba457", new Object[]{this, uri, experimentV5});
            return;
        }
        String g = g(uri, "<PATH-EMPTY>");
        if (a(g)) {
            synchronized (this.c) {
                ((ArrayList) this.b).add(experimentV5);
            }
            return;
        }
        List<ExperimentV5> list = this.f20118a.get(g);
        if (list == null) {
            synchronized (this.d) {
                if (list == null) {
                    try {
                        list = new ArrayList<>();
                        this.f20118a.put(g, list);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        synchronized (list) {
            list.add(experimentV5);
        }
    }

    public final boolean k(qpm<ExperimentV5> qpmVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c69858b3", new Object[]{this, qpmVar})).booleanValue();
        }
        if (qpmVar == null) {
            return false;
        }
        synchronized (this.d) {
            try {
                for (Map.Entry<String, List<ExperimentV5>> entry : this.f20118a.entrySet()) {
                    List<ExperimentV5> value = entry.getValue();
                    if (!(value == null || value.size() == 0)) {
                        Iterator<ExperimentV5> it = value.iterator();
                        while (it.hasNext()) {
                            if (((ho8) qpmVar).a(it.next())) {
                                it.remove();
                                z = true;
                            }
                        }
                    }
                }
            } finally {
            }
        }
        synchronized (this.c) {
            try {
                Iterator it2 = ((ArrayList) this.b).iterator();
                while (it2.hasNext()) {
                    if (((ho8) qpmVar).a(it2.next())) {
                        it2.remove();
                        z = true;
                    }
                }
            } finally {
            }
        }
        return z;
    }
}
