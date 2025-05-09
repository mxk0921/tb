package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.config.Config;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.n45;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p45 extends n45 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<n45.a> e;
    public String f;
    public final List<n45.a> g;
    public final List<n45.a> h;
    public final List<n45.a> i;
    public final List<n45.a> j;
    public final List<n45.a> k;
    public final Map<String, List<n45.a>> l;
    public final Map<String, List<n45.a>> m;
    public ArrayList<String> n;

    static {
        t2o.a(1034944704);
    }

    public p45(Config.ModelTriggerMatchRuleForUT modelTriggerMatchRuleForUT) {
        if (modelTriggerMatchRuleForUT != null) {
            int i = modelTriggerMatchRuleForUT.eventId;
            if (i > 0 || i == -19999) {
                this.f24498a = i;
                this.b = modelTriggerMatchRuleForUT.ownerId;
                this.c = modelTriggerMatchRuleForUT.batch;
                this.e = d(modelTriggerMatchRuleForUT.pageNotInList);
                this.g = d(modelTriggerMatchRuleForUT.pageInList);
                this.h = d(modelTriggerMatchRuleForUT.arg1NotInList);
                this.i = d(modelTriggerMatchRuleForUT.arg1InList);
                this.j = d(modelTriggerMatchRuleForUT.arg2InList);
                this.k = d(modelTriggerMatchRuleForUT.arg3InList);
                this.l = e(modelTriggerMatchRuleForUT.argsNotInMap);
                this.m = e(modelTriggerMatchRuleForUT.argsInMap);
            }
        }
    }

    public static String i(List<n45.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7223f8e", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (n45.a aVar : list) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(aVar.a());
        }
        return sb.toString();
    }

    public static /* synthetic */ Object ipc$super(p45 p45Var, String str, Object... objArr) {
        if (str.hashCode() == -759562652) {
            return super.c((UserTrackDO) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/model/DAIModelTriggerUTDataExtend");
    }

    @Override // tb.n45
    public ArrayList<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a8bff31e", new Object[]{this});
        }
        ArrayList<String> arrayList = this.n;
        if (arrayList != null) {
            return arrayList;
        }
        this.n = new ArrayList<>();
        List<n45.a> list = this.g;
        if (list != null) {
            Iterator<n45.a> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n45.a next = it.next();
                if (next.b()) {
                    this.n.clear();
                    break;
                }
                ArrayList<String> arrayList2 = this.n;
                arrayList2.add("" + this.f24498a + "#" + next.a());
            }
        }
        if (this.n.size() == 0) {
            ArrayList<String> arrayList3 = this.n;
            arrayList3.add("" + this.f24498a);
        }
        return this.n;
    }

    @Override // tb.n45
    public TriggerMatchResult c(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("d2b9fe64", new Object[]{this, userTrackDO});
        }
        TriggerMatchResult c = super.c(userTrackDO);
        if (!c.f14216a) {
            return c;
        }
        if (!f(this.e) && h(this.e, userTrackDO.getPageName())) {
            return TriggerMatchResult.b(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_PAGE_NOT_MATCH, "page_not_in not match");
        }
        if (!(f(this.g) || h(this.g, userTrackDO.getPageName()))) {
            return TriggerMatchResult.b(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_PAGE_NOT_MATCH, "page not match");
        }
        if (!f(this.h) && h(this.h, userTrackDO.getArg1())) {
            return TriggerMatchResult.b(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH, "arg1_not_in not match");
        }
        if (!f(this.i) && !h(this.i, userTrackDO.getArg1())) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH;
            return TriggerMatchResult.b(triggerMatchResultCode, "arg1 not match required " + i(this.i) + " got " + userTrackDO.getArg1());
        } else if (!f(this.j) && !h(this.j, userTrackDO.getArg2())) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode2 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG2_NOT_MATCH;
            return TriggerMatchResult.b(triggerMatchResultCode2, "arg2 not match required " + i(this.j) + " got " + userTrackDO.getArg2());
        } else if (f(this.k) || h(this.k, userTrackDO.getArg3())) {
            if (!g(this.l)) {
                for (Map.Entry<String, String> entry : userTrackDO.getArgs().entrySet()) {
                    List<n45.a> list = this.l.get(entry.getKey());
                    if (!f(list) && h(list, entry.getValue())) {
                        TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode3 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH;
                        return TriggerMatchResult.b(triggerMatchResultCode3, "args_not_in not match key :" + entry.getKey() + " got value " + entry.getValue());
                    }
                }
            }
            if (!g(this.m)) {
                Map<String, String> args = userTrackDO.getArgs();
                Map<String, List<n45.a>> map = this.m;
                if (!(map == null || args == null)) {
                    if (map.size() > args.size()) {
                        TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode4 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH;
                        return TriggerMatchResult.b(triggerMatchResultCode4, "args match size " + this.m.size() + "data size : " + userTrackDO.getArgs().size());
                    }
                    for (Map.Entry<String, List<n45.a>> entry2 : this.m.entrySet()) {
                        List<n45.a> value = entry2.getValue();
                        if (!(f(value) || h(value, args.get(entry2.getKey())))) {
                            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode5 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH;
                            return TriggerMatchResult.b(triggerMatchResultCode5, "args_not_in not match key :" + entry2.getKey() + " required value " + i(entry2.getValue()) + " got value: " + args.get(entry2.getKey()));
                        }
                    }
                }
            }
            return TriggerMatchResult.c();
        } else {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode6 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH;
            return TriggerMatchResult.b(triggerMatchResultCode6, "arg3 not match required " + i(this.k) + " got " + userTrackDO.getArg3());
        }
    }

    public final List<n45.a> d(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c2c1d55f", new Object[]{this, list});
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(new n45.a(str));
            }
        }
        return arrayList;
    }

    public final Map<String, List<n45.a>> e(Map<String, List<String>> map) {
        List<String> value;
        List<n45.a> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27b8ffc9", new Object[]{this, map});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && (value = entry.getValue()) != null && value.size() > 0 && (d = d(value)) != null && d.size() > 0) {
                hashMap.put(entry.getKey(), d);
            }
        }
        return hashMap;
    }

    public final boolean f(List<n45.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf56a55f", new Object[]{this, list})).booleanValue();
        }
        if (list == null || list.size() <= 0) {
            return true;
        }
        return false;
    }

    public final boolean g(Map<String, List<n45.a>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caa5c045", new Object[]{this, map})).booleanValue();
        }
        if (map == null || map.size() <= 0) {
            return true;
        }
        return false;
    }

    public final boolean h(List<n45.a> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("902c016b", new Object[]{this, list, str})).booleanValue();
        }
        for (n45.a aVar : list) {
            if (aVar != null && aVar.c(str)) {
                return true;
            }
        }
        return false;
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40aa8475", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("{");
        String str9 = "";
        if (this.e != null) {
            str = "pageNotInList=" + this.e;
        } else {
            str = str9;
        }
        sb.append(str);
        if (this.f != null) {
            str2 = ", triId='" + this.f;
        } else {
            str2 = str9;
        }
        sb.append(str2);
        if (this.g != null) {
            str3 = ", pageInList=" + this.g;
        } else {
            str3 = str9;
        }
        sb.append(str3);
        if (this.h != null) {
            str4 = ", arg1NotInList=" + this.h;
        } else {
            str4 = str9;
        }
        sb.append(str4);
        if (this.i != null) {
            str5 = ", arg1InList=" + this.i;
        } else {
            str5 = str9;
        }
        sb.append(str5);
        if (this.j != null) {
            str6 = ", arg2InList=" + this.j;
        } else {
            str6 = str9;
        }
        sb.append(str6);
        if (this.k != null) {
            str7 = ", arg3InList=" + this.k;
        } else {
            str7 = str9;
        }
        sb.append(str7);
        if (this.l != null) {
            str8 = ", argsNotInMap=" + this.l;
        } else {
            str8 = str9;
        }
        sb.append(str8);
        if (this.m != null) {
            str9 = ", argsInMap=" + this.m;
        }
        sb.append(str9);
        sb.append('}');
        return sb.toString();
    }
}
