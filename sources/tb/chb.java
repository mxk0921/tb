package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface chb {
    public static final chb DEFAULT = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements chb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.chb
        public boolean containsKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f324f255", new Object[]{this, str})).booleanValue();
            }
            return false;
        }

        @Override // tb.chb
        public boolean getBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            return z;
        }

        @Override // tb.chb
        public float getFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
            }
            return f;
        }

        @Override // tb.chb
        public int getInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
            }
            return i;
        }

        @Override // tb.chb
        public long getLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
            }
            return j;
        }

        @Override // tb.chb
        public String getString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
            }
            return str2;
        }
    }

    boolean containsKey(String str);

    boolean getBoolean(String str, boolean z);

    float getFloat(String str, float f);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);
}
