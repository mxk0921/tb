package tb;

import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g1v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_ARG1 = "_field_arg1";
    public static final String FIELD_ARG2 = "_field_arg2";
    public static final String FIELD_ARG3 = "_field_arg3";
    public static final String FIELD_ARGS = "_field_args";
    public static final String FIELD_EVENT_ID = "_field_event_id";
    public static final String FIELD_PAGE = "_field_page";
    private Map<String, String> mHitMap = new HashMap(64);
    private Map<String, String> mTempHitMap = new HashMap(64);

    static {
        t2o.a(962593161);
    }

    public g1v() {
        if (!this.mHitMap.containsKey(FIELD_PAGE)) {
            this.mHitMap.put(FIELD_PAGE, "UT");
        }
    }

    private static boolean _checkIlleagleProperty(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f106fe69", new Object[]{map})).booleanValue();
        }
        if (map != null) {
            map.remove(null);
            map.remove("");
            if (map.containsKey("PAGE")) {
                nhh.i("checkIlleagleProperty", "IlleaglePropertyKey(PAGE) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            } else if (map.containsKey(oeh.EVENTID)) {
                nhh.i("checkIlleagleProperty", "IlleaglePropertyKey(EVENTID) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            } else if (map.containsKey(oeh.ARG1)) {
                nhh.i("checkIlleagleProperty", "IlleaglePropertyKey(ARG1) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            } else if (map.containsKey(oeh.ARG2)) {
                nhh.i("checkIlleagleProperty", "IlleaglePropertyKey(ARG2) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            } else if (map.containsKey(oeh.ARG3)) {
                nhh.i("checkIlleagleProperty", "IlleaglePropertyKey(ARG3) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            }
        }
        return true;
    }

    private static void _dropAllIllegalFields(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46335902", new Object[]{map});
        } else if (map != null) {
            map.remove("PAGE");
            map.remove(oeh.EVENTID);
            map.remove(oeh.ARG1);
            map.remove(oeh.ARG2);
            map.remove(oeh.ARG3);
            map.remove(oeh.ARGS);
        }
    }

    private static void _translateFieldsName(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4b872b", new Object[]{map});
        } else if (map != null) {
            String remove = map.remove(FIELD_PAGE);
            if (remove != null) {
                map.put("PAGE", remove);
            }
            String remove2 = map.remove(FIELD_ARG1);
            if (remove2 != null) {
                map.put(oeh.ARG1, remove2);
            }
            String remove3 = map.remove(FIELD_ARG2);
            if (remove3 != null) {
                map.put(oeh.ARG2, remove3);
            }
            String remove4 = map.remove(FIELD_ARG3);
            if (remove4 != null) {
                map.put(oeh.ARG3, remove4);
            }
            String remove5 = map.remove(FIELD_ARGS);
            if (remove5 != null) {
                map.put(oeh.ARGS, remove5);
            }
            String remove6 = map.remove(FIELD_EVENT_ID);
            if (remove6 != null) {
                map.put(oeh.EVENTID, remove6);
            }
        }
    }

    public Map<String, String> build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce31e56a", new Object[]{this});
        }
        Map<String, String> map = this.mHitMap;
        map.put("_bmbu", Constants.VAL_YES);
        if (!_checkIlleagleProperty(map)) {
            return null;
        }
        _dropAllIllegalFields(map);
        _translateFieldsName(map);
        if (!map.containsKey(oeh.EVENTID)) {
            return null;
        }
        Map<String, String> map2 = this.mTempHitMap;
        if (map2 != null && map2.size() > 0) {
            _dropAllIllegalFields(this.mTempHitMap);
            for (Map.Entry<String, String> entry : this.mTempHitMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!map.containsKey(key)) {
                    map.put(zj4.UT_TMP_ARGS_KEY + key, value);
                }
            }
        }
        return map;
    }

    public String getProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88202484", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        if (this.mHitMap.containsKey(str)) {
            return this.mHitMap.get(str);
        }
        if (this.mTempHitMap.containsKey(str)) {
            return this.mTempHitMap.get(str);
        }
        return null;
    }

    public g1v setProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1v) ipChange.ipc$dispatch("3028d87e", new Object[]{this, str, str2});
        }
        if (hsq.f(str) || str2 == null) {
            nhh.i("UTHitBuilders", "setProperties key", str, "value", str2);
        } else {
            this.mHitMap.put(str, str2);
        }
        return this;
    }

    public g1v setTmpProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1v) ipChange.ipc$dispatch("ca47322b", new Object[]{this, str, str2});
        }
        if (hsq.f(str) || str2 == null) {
            nhh.i("UTHitBuilders", "setTmpProperty key", str, "value", str2);
        } else {
            this.mTempHitMap.put(str, str2);
        }
        return this;
    }

    public g1v setProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1v) ipChange.ipc$dispatch("8775e947", new Object[]{this, map});
        }
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!(key instanceof String)) {
                        nhh.i("UTHitBuilders", "setProperties key", key, "value", value);
                    } else if (value instanceof String) {
                        setProperty(key, value);
                    } else {
                        nhh.i("UTHitBuilders", "setProperties key", key, "value", value);
                    }
                }
            } catch (Exception e) {
                nhh.h("UTHitBuilders", e, new Object[0]);
            }
        }
        return this;
    }

    public g1v setTmpProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1v) ipChange.ipc$dispatch("7933fcba", new Object[]{this, map});
        }
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!(key instanceof String)) {
                        nhh.i("UTHitBuilders", "setProperties key", key, "value", value);
                    } else if (value instanceof String) {
                        setTmpProperty(key, value);
                    } else {
                        nhh.i("UTHitBuilders", "setProperties key", key, "value", value);
                    }
                }
            } catch (Exception e) {
                nhh.h("UTHitBuilders", e, new Object[0]);
            }
        }
        return this;
    }
}
