package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.preload.protocol.IPreloadService;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.regex.Pattern;
import tb.enm;
import tb.rpv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class lx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CAMPAIGN_TAB_TASK_ID = "tab_campaign_";
    private static final String TAG = "AbsPreLoadScheduleService";
    private static final String WH_FROM = "wh_from";
    private static final String WH_PID = "wh_pid";
    private static final Pattern WOW_ACT_PATTERN = Pattern.compile("/wow/a/act");
    private final Set<String> mCreatedPreLoadTask = new ConcurrentSkipListSet();
    private final Map<String, String> mCreatedPreloadUrlMap = new HashMap();
    public IPreloadService mPreloadService;
    public oz mUserTrackScore;

    static {
        t2o.a(729810249);
    }

    private enm createPreLoadModel(JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enm) ipChange.ipc$dispatch("b2cbfe1e", new Object[]{this, jSONObject, str, str2, str3});
        }
        String string = jSONObject.getString("sectionBizCode");
        if (!TextUtils.isEmpty(string)) {
            return new enm.b(str, str2).o(str3).m(jSONObject.getJSONObject("params")).l(string).n(jSONObject.getString("slotBizCode")).k();
        }
        fve.e(TAG, "sectionBizCode 为空");
        return null;
    }

    private void destroyPreviousTask(Set<String> set, Set<String> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d1b91d", new Object[]{this, set, set2});
            return;
        }
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.mPreloadService.c().a((String) it.next());
        }
        this.mCreatedPreLoadTask.clear();
        this.mCreatedPreLoadTask.addAll(set2);
    }

    private String getTaskId(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e50b86c4", new Object[]{this, str, new Integer(i)});
        }
        if (str != null && !str.isEmpty()) {
            try {
                String b = oov.b(str, WH_PID);
                String b2 = oov.b(str, WH_FROM);
                if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2) && isExpectedLink(str)) {
                    fve.e(TAG, "pid: " + b + "from: " + b2);
                    return CAMPAIGN_TAB_TASK_ID + i;
                } else if (TextUtils.isEmpty(b)) {
                    return new URL(str).getPath();
                } else {
                    fve.e(TAG, "pid: " + b);
                    return b;
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private boolean isExpectedLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74a17eb1", new Object[]{this, str})).booleanValue();
        }
        try {
            return WOW_ACT_PATTERN.matcher(new URL(str).getPath()).find();
        } catch (Exception e) {
            fve.e(TAG, "Invalid URL: " + str + ", Error: " + e.getMessage());
            return false;
        }
    }

    public void destroyAllTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc043f3", new Object[]{this});
        } else if (!this.mCreatedPreLoadTask.isEmpty()) {
            for (String str : this.mCreatedPreLoadTask) {
                this.mPreloadService.c().a(str);
            }
            this.mCreatedPreLoadTask.clear();
        }
    }

    public void registerPreLoadTask(String str, String str2, xbd xbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524b98f2", new Object[]{this, str, str2, xbdVar});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            fve.e(TAG, "taskType or taskId is empty,taskType: " + str2);
        } else {
            str2.hashCode();
            if (str2.equals("preLoadChunk")) {
                this.mPreloadService.c().b(str, new ymm(xbdVar));
                this.mCreatedPreLoadTask.add(str);
                fve.e(TAG, "registerPreLoadTask taskId: " + str);
            }
        }
    }

    public void unRegisterPreLoadTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58bff8d9", new Object[]{this});
        } else if (this.mCreatedPreLoadTask.isEmpty()) {
            fve.e(TAG, "mCreatedPreLoadTask is empty");
        } else {
            for (String str : this.mCreatedPreLoadTask) {
                this.mPreloadService.c().a(str);
            }
            this.mCreatedPreLoadTask.clear();
        }
    }

    public void updateUserTrackScoreRules(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af5bed", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                fve.e(TAG, "rule == null");
                return;
            }
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                fve.e(TAG, "userTrackScoreRules == null");
                return;
            }
            int intValue = parseObject.getIntValue("clickScore");
            int intValue2 = parseObject.getIntValue("stayTimeScore");
            JSONObject jSONObject = parseObject.getJSONObject("bizScoreRules");
            int intValue3 = parseObject.getIntValue("distanceScore");
            this.mUserTrackScore.l(new rpv.b().i(jSONObject).j(intValue).l(intValue3).k(parseObject.getJSONArray("distanceGrading")).m(parseObject.getJSONArray("statisticalBehavior")).n(parseObject.getJSONArray("stayTimeGrading")).o(intValue2).h());
        } catch (Exception e) {
            fve.e(TAG, "updateUserTrackScoreRules Exception: " + e);
        }
    }

    private boolean isSameCampaignTabUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e615fb9", new Object[]{this, str, str2})).booleanValue();
        }
        return TextUtils.equals(oov.b(str, WH_PID), oov.b(str2, WH_PID)) && TextUtils.equals(oov.b(str, WH_FROM), oov.b(str2, WH_FROM));
    }

    public void updatePreLoadModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa380f00", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("taskList");
        if (TextUtils.isEmpty(string)) {
            destroyAllTask();
            fve.e(TAG, "updatePreLoadModel taskListStr == null");
            return;
        }
        try {
            JSONArray parseArray = JSON.parseArray(string);
            if (parseArray != null && !parseArray.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject2 = parseArray.getJSONObject(i);
                    String string2 = jSONObject2.getString("url");
                    String taskId = getTaskId(string2, i);
                    hashSet.add(taskId);
                    if (this.mCreatedPreLoadTask.contains(taskId)) {
                        if (isSameCampaignTabUrl(string2, this.mCreatedPreloadUrlMap.get(taskId))) {
                            fve.e(TAG, "任务已经存在");
                        } else {
                            this.mPreloadService.c().a(taskId);
                            fve.e(TAG, "销毁之前的任务");
                        }
                    }
                    enm createPreLoadModel = createPreLoadModel(jSONObject2, taskId, "preLoadChunk", string2);
                    this.mCreatedPreloadUrlMap.put(taskId, string2);
                    registerPreLoadTask(taskId, "preLoadChunk", createPreLoadModel);
                    this.mPreloadService.a(createPreLoadModel);
                }
                destroyPreviousTask(this.mCreatedPreLoadTask, hashSet);
                return;
            }
            destroyAllTask();
            fve.e(TAG, "updatePreLoadModel taskList == null");
        } catch (Exception e) {
            fve.e(TAG, "updatePreLoadModel Exception: " + e);
        }
    }
}
