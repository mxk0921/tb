package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Helper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<Constraint.Side, String> sideMap;
    public static final Map<Type, String> typeMap;
    public String config;
    public Map<String, String> configMap;
    public final String name;
    public HelperType type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class HelperType {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String mName;

        public HelperType(String str) {
            this.mName = str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.mName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Type extends Enum<Type> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Type VERTICAL_GUIDELINE = new Type("VERTICAL_GUIDELINE", 0);
        public static final Type HORIZONTAL_GUIDELINE = new Type("HORIZONTAL_GUIDELINE", 1);
        public static final Type VERTICAL_CHAIN = new Type("VERTICAL_CHAIN", 2);
        public static final Type HORIZONTAL_CHAIN = new Type("HORIZONTAL_CHAIN", 3);
        public static final Type BARRIER = new Type("BARRIER", 4);
        private static final /* synthetic */ Type[] $VALUES = $values();

        private static /* synthetic */ Type[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("5cedbd71", new Object[0]) : new Type[]{VERTICAL_GUIDELINE, HORIZONTAL_GUIDELINE, VERTICAL_CHAIN, HORIZONTAL_CHAIN, BARRIER};
        }

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Helper$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("ccda4fdc", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type[]) ipChange.ipc$dispatch("35cf24d", new Object[0]);
            }
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        sideMap = hashMap;
        hashMap.put(Constraint.Side.LEFT, "'left'");
        hashMap.put(Constraint.Side.RIGHT, "'right'");
        hashMap.put(Constraint.Side.TOP, "'top'");
        hashMap.put(Constraint.Side.BOTTOM, "'bottom'");
        hashMap.put(Constraint.Side.START, "'start'");
        hashMap.put(Constraint.Side.END, "'end'");
        hashMap.put(Constraint.Side.BASELINE, "'baseline'");
        HashMap hashMap2 = new HashMap();
        typeMap = hashMap2;
        hashMap2.put(Type.VERTICAL_GUIDELINE, "vGuideline");
        hashMap2.put(Type.HORIZONTAL_GUIDELINE, "hGuideline");
        hashMap2.put(Type.VERTICAL_CHAIN, "vChain");
        hashMap2.put(Type.HORIZONTAL_CHAIN, "hChain");
        hashMap2.put(Type.BARRIER, "barrier");
    }

    public Helper(String str, HelperType helperType) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
    }

    public static void main(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2272e75f", new Object[]{strArr});
        } else {
            System.out.println(new Barrier("abc", "['a1', 'b2']").toString());
        }
    }

    public void append(Map<String, String> map, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89140de7", new Object[]{this, map, sb});
        } else if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(":");
                sb.append(map.get(str));
                sb.append(",\n");
            }
        }
    }

    public Map<String, String> convertConfigToMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46830e88", new Object[]{this});
        }
        String str = this.config;
        if (str == null || str.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.config.length(); i3++) {
            char charAt = this.config.charAt(i3);
            if (charAt == ':') {
                str2 = sb.toString();
                sb.setLength(0);
            } else if (charAt == ',' && i == 0 && i2 == 0) {
                hashMap.put(str2, sb.toString());
                sb.setLength(0);
                str2 = "";
            } else if (charAt != ' ') {
                if (charAt == '[') {
                    i++;
                } else if (charAt == ']') {
                    i--;
                } else if (charAt == '{') {
                    i2++;
                } else if (charAt == '}') {
                    i2--;
                }
                sb.append(charAt);
            }
        }
        hashMap.put(str2, sb.toString());
        return hashMap;
    }

    public String getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8f91bc1", new Object[]{this});
        }
        return this.config;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.name;
    }

    public HelperType getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HelperType) ipChange.ipc$dispatch("80282ad0", new Object[]{this});
        }
        return this.type;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(this.name + ":{\n");
        if (this.type != null) {
            sb.append("type:'");
            sb.append(this.type.toString());
            sb.append("',\n");
        }
        Map<String, String> map = this.configMap;
        if (map != null) {
            append(map, sb);
        }
        sb.append("},\n");
        return sb.toString();
    }

    public Helper(String str, HelperType helperType, String str2) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
        this.config = str2;
        this.configMap = convertConfigToMap();
    }
}
