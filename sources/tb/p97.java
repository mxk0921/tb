package tb;

import android.app.job.JobInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.alibaba.android.split.SplitFileInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p97 extends qv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context b;
    private final JobInfo c;
    private o5c d = new y07();
    private wnc e = (wnc) d62.b(wnc.class, "DefferInstallJob");

    static {
        t2o.a(683671556);
    }

    public p97(Context context, JobInfo jobInfo) {
        this.b = context;
        this.c = jobInfo;
    }

    public static /* synthetic */ Object ipc$super(p97 p97Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/job/DefferInstallJob");
    }

    @Override // tb.qv
    public wnc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnc) ipChange.ipc$dispatch("531d6508", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.qv
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d27d49fa", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.qv
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c66fc11", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            PersistableBundle extras = this.c.getExtras();
            String[] stringArray = extras.getStringArray("module_names");
            int i = extras.getInt("version_code", 0);
            int i2 = extras.getInt("sessionId", 0);
            ArrayList arrayList = new ArrayList(Arrays.asList(stringArray));
            for (String str : stringArray) {
                if (((y07) this.d).b(str) != null) {
                    for (String str2 : ((y07) this.d).b(str)) {
                        if (!arrayList.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                }
            }
            if (bcq.b()) {
                bcq.a().g(this.b, true, (String[]) arrayList.toArray(new String[0]));
            }
            if (!mcq.a().a().containsAll(arrayList)) {
                Map<String, Intent> d = d(this.b, arrayList, i2);
                if (!d.keySet().containsAll(arrayList) && arrayList.size() > 0 && n1r.j(this.b) && n1r.f(this.b)) {
                    l0c l0cVar = (l0c) d62.a(l0c.class, this.b);
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        SplitFileInfo a2 = new xtl().a(str3);
                        if (a2 != null && !d.keySet().contains(str3)) {
                            arrayList2.add(a2);
                        }
                    }
                    Map<String, Intent> a3 = a(this.b, arrayList, i2, arrayList2);
                    if (!a3.keySet().containsAll(arrayList)) {
                        Iterator it2 = arrayList2.iterator();
                        ArrayList arrayList3 = new ArrayList();
                        while (it2.hasNext()) {
                            SplitFileInfo splitFileInfo = (SplitFileInfo) it2.next();
                            q5c a4 = ddq.a();
                            if (o49.b().a(splitFileInfo.splitName) > 0 && a4 != null && a4.a(splitFileInfo.splitName, "baseline").equals("baseline")) {
                                arrayList3.add(splitFileInfo);
                                it2.remove();
                            } else if (o49.b().a(splitFileInfo.splitName) == -1) {
                                it2.remove();
                            } else if (mcq.a().a().contains(splitFileInfo.splitName) && a4 != null && a4.a(splitFileInfo.splitName, "baseline").equals("baseline")) {
                                arrayList3.add(splitFileInfo);
                                it2.remove();
                            } else if (a3.containsKey(splitFileInfo.splitName)) {
                                arrayList3.add(splitFileInfo);
                                it2.remove();
                            }
                        }
                        if (arrayList2.size() == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("session_id", i2);
                            bundle.putInt("status", 3);
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                SplitFileInfo splitFileInfo2 = (SplitFileInfo) it3.next();
                                if (!a3.keySet().contains(splitFileInfo2.splitName)) {
                                    arrayList4.add(splitFileInfo2.splitName);
                                    Intent intent = new Intent();
                                    intent.putExtra("split_id", splitFileInfo2.splitName);
                                    arrayList5.add(intent);
                                }
                            }
                            for (Map.Entry<String, Intent> entry : d.entrySet()) {
                                arrayList4.add(entry.getKey());
                                arrayList5.add(entry.getValue());
                            }
                            for (Map.Entry<String, Intent> entry2 : a3.entrySet()) {
                                arrayList4.add(entry2.getKey());
                                arrayList5.add(entry2.getValue());
                            }
                            bundle.putStringArrayList("module_names", arrayList4);
                            bundle.putParcelableArrayList("split_file_intents", arrayList5);
                            Context context = this.b;
                            dmi.b(context, context.getPackageName(), bundle);
                        } else if (l0cVar != null) {
                            dyn.q(this.b).g(arrayList).d(l0cVar).f(d).e(a3).h(true).i(false).c(arrayList3).a().p(arrayList2, i2, i);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
