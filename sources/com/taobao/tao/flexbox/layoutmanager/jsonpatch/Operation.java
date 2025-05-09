package com.taobao.tao.flexbox.layoutmanager.jsonpatch;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.view.gesture.WXGesture;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum Operation {
    ADD("add"),
    REMOVE("remove"),
    REPLACE("replace"),
    MOVE(WXGesture.MOVE),
    COPY("copy"),
    TEST("test");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Operation> OPS;
    private String rfcName;

    static {
        Operation operation = ADD;
        Operation operation2 = REMOVE;
        Operation operation3 = REPLACE;
        Operation operation4 = MOVE;
        Operation operation5 = COPY;
        Operation operation6 = TEST;
        HashMap hashMap = new HashMap();
        OPS = hashMap;
        hashMap.put(operation.rfcName, operation);
        hashMap.put(operation2.rfcName, operation2);
        hashMap.put(operation3.rfcName, operation3);
        hashMap.put(operation4.rfcName, operation4);
        hashMap.put(operation5.rfcName, operation5);
        hashMap.put(operation6.rfcName, operation6);
    }

    Operation(String str) {
        this.rfcName = str;
    }

    public static Operation fromRfcName(String str) throws InvalidJsonPatchException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Operation) ipChange.ipc$dispatch("7c8c3435", new Object[]{str});
        }
        if (str != null) {
            Operation operation = OPS.get(str.toLowerCase());
            if (operation != null) {
                return operation;
            }
            throw new InvalidJsonPatchException("unknown / unsupported operation ".concat(str));
        }
        throw new InvalidJsonPatchException("rfcName cannot be null");
    }

    public static /* synthetic */ Object ipc$super(Operation operation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/jsonpatch/Operation");
    }

    public static Operation valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Operation) ipChange.ipc$dispatch("41869add", new Object[]{str});
        }
        return (Operation) Enum.valueOf(Operation.class, str);
    }

    public String rfcName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eee7c35f", new Object[]{this});
        }
        return this.rfcName;
    }
}
