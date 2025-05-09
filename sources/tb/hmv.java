package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.task.BehaviXTaskType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hmv extends w82 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, Object> c;

    static {
        t2o.a(404750645);
    }

    public hmv(BehaviXTaskType behaviXTaskType, Map<String, Object> map, x82 x82Var) {
        super(behaviXTaskType, map, x82Var);
        ly1 ly1Var;
        Map<String, Object> map2;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (map != null && (ly1Var = (ly1) map.get("baseNode")) != null && (map2 = ly1Var.w) != null) {
            hashMap.putAll(map2);
        }
    }

    public static /* synthetic */ Object ipc$super(hmv hmvVar, String str, Object... objArr) {
        if (str.hashCode() == 1548812690) {
            super.a();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/task/nativeTask/UploadTask");
    }

    @Override // tb.w82
    public void a() {
        ly1 ly1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        super.a();
        Map<String, Object> map = this.b;
        if (map != null && (ly1Var = (ly1) map.get("baseNode")) != null) {
            b(ly1Var);
        }
    }

    public void b(ly1 ly1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460a73dc", new Object[]{this, ly1Var});
            return;
        }
        String str = "behavior." + ly1Var.h + "." + ly1Var.d + "." + ly1Var.i;
        Map<String, Object> map = this.c;
        if (map != null && ((HashMap) map).size() != 0) {
            oxa.a().b(str, new JSONObject(this.c));
        }
    }
}
