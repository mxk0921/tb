package com.taobao.weex.ui.component.pesudo;

import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PesudoStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLASS_ACTIVE = 0;
    public static final int CLASS_DISABLED = 3;
    public static final int CLASS_ENABLED = 2;
    public static final int CLASS_FOCUS = 1;
    private static final int SET = 1;
    private static final int UNSET = 0;
    private int[] mStatuses = new int[4];

    static {
        t2o.a(985661719);
    }

    public PesudoStatus() {
        int i = 0;
        while (true) {
            int[] iArr = this.mStatuses;
            if (i < iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public String getStatuses() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7503c323", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (isSet(0)) {
            sb.append(Constants.PSEUDO.ACTIVE);
        }
        if (isSet(3)) {
            sb.append(Constants.PSEUDO.DISABLED);
        }
        if (isSet(1) && !isSet(3)) {
            sb.append(Constants.PSEUDO.FOCUS);
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public boolean isSet(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2241d788", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mStatuses[i] == 1) {
            return true;
        }
        return false;
    }

    public void setStatus(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e410ef", new Object[]{this, str, new Boolean(z)});
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1487344704:
                if (str.equals(Constants.PSEUDO.ACTIVE)) {
                    c = 0;
                    break;
                }
                break;
            case -1482202954:
                if (str.equals(Constants.PSEUDO.DISABLED)) {
                    c = 1;
                    break;
                }
                break;
            case 689157575:
                if (str.equals(Constants.PSEUDO.ENABLED)) {
                    c = 2;
                    break;
                }
                break;
            case 1758095582:
                if (str.equals(Constants.PSEUDO.FOCUS)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setStatus(0, z);
                return;
            case 1:
                setStatus(3, z);
                return;
            case 2:
                setStatus(2, z);
                return;
            case 3:
                setStatus(1, z);
                return;
            default:
                return;
        }
    }

    public Map<String, Object> updateStatusAndGetUpdateStyles(String str, boolean z, Map<String, Map<String, Object>> map, Map<String, Object> map2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b553b33", new Object[]{this, str, new Boolean(z), map, map2});
        }
        String statuses = getStatuses();
        setStatus(str, z);
        Map<String, Object> map3 = map.get(getStatuses());
        Map<String, Object> map4 = map.get(statuses);
        ArrayMap arrayMap = new ArrayMap();
        if (map4 != null) {
            arrayMap.putAll(map4);
        }
        for (K k : arrayMap.keySet()) {
            if (map2.containsKey(k)) {
                obj = map2.get(k);
            } else {
                obj = "";
            }
            arrayMap.put(k, obj);
        }
        if (map3 != null) {
            for (Map.Entry<String, Object> entry : map3.entrySet()) {
                arrayMap.put(entry.getKey(), entry.getValue());
            }
        }
        return arrayMap;
    }

    public void setStatus(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ab3eec", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mStatuses[i] = z ? 1 : 0;
        }
    }
}
