package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e91 extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(e91 e91Var) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expression/parser/AppStyleParser$1");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            f91.a().c();
            return null;
        }
    }

    static {
        t2o.a(444596284);
    }

    public e91() {
        new a(this).execute(new Void[0]);
    }

    public static /* synthetic */ Object ipc$super(e91 e91Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expression/parser/AppStyleParser");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        if (list != null) {
            try {
                if (list.size() != 0) {
                    Object obj2 = list.get(0);
                    if (obj2 != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(obj2.toString(), " .[]", false);
                        if (stringTokenizer.hasMoreTokens()) {
                            obj = f91.a().c();
                            while (stringTokenizer.hasMoreTokens()) {
                                obj = e2w.a(obj, stringTokenizer.nextToken());
                            }
                            return (obj != null && list.size() > 1) ? list.get(1) : obj;
                        }
                    }
                    obj = null;
                    if (obj != null) {
                        return obj;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                bn7Var.e().b().a(mm7.ERROR_CODE_TEMPLATE_PARSER_EXCEPTION, "AppStyleParser parse error");
            }
        }
        return null;
    }
}
