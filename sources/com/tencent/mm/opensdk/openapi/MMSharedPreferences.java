package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
class MMSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";
    private final ContentResolver cr;
    private final String[] columns = {"_id", "key", "type", "value"};
    private final HashMap<String, Object> values = new HashMap<>();
    private REditor editor = null;

    public MMSharedPreferences(Context context) {
        this.cr = context.getContentResolver();
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (getValue(str) != null) {
            return true;
        }
        return false;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        try {
            Cursor query = this.cr.query(a.f14199a, this.columns, null, null, null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("key");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("value");
            while (query.moveToNext()) {
                this.values.put(query.getString(columnIndex), com.tencent.mm.opensdk.channel.a.a.a(query.getInt(columnIndex2), query.getString(columnIndex3)));
            }
            query.close();
            return this.values;
        } catch (Exception e) {
            Log.e(TAG, "getAll exception:" + e.getMessage());
            return this.values;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object value = getValue(str);
        if (value == null || !(value instanceof Boolean)) {
            return z;
        }
        return ((Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object value = getValue(str);
        if (value == null || !(value instanceof Float)) {
            return f;
        }
        return ((Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object value = getValue(str);
        if (value == null || !(value instanceof Integer)) {
            return i;
        }
        return ((Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object value = getValue(str);
        if (value == null || !(value instanceof Long)) {
            return j;
        }
        return ((Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object value = getValue(str);
        if (value == null || !(value instanceof String)) {
            return str2;
        }
        return (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    private Object getValue(String str) {
        Object obj;
        try {
            Cursor query = this.cr.query(a.f14199a, this.columns, "key = ?", new String[]{str}, null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("type");
            int columnIndex2 = query.getColumnIndex("value");
            if (query.moveToFirst()) {
                obj = com.tencent.mm.opensdk.channel.a.a.a(query.getInt(columnIndex), query.getString(columnIndex2));
            } else {
                obj = null;
            }
            query.close();
            return obj;
        } catch (Exception e) {
            Log.e(TAG, "getValue exception:" + e.getMessage());
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class REditor implements SharedPreferences.Editor {
        private ContentResolver cr;
        private Map<String, Object> values = new HashMap();
        private Set<String> remove = new HashSet();
        private boolean clear = false;

        public REditor(ContentResolver contentResolver) {
            this.cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x003f A[SYNTHETIC] */
        @Override // android.content.SharedPreferences.Editor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean commit() {
            /*
                r9 = this;
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                boolean r1 = r9.clear
                r2 = 0
                if (r1 == 0) goto L_0x0014
                android.content.ContentResolver r1 = r9.cr
                android.net.Uri r3 = com.tencent.mm.opensdk.utils.a.f14199a
                r4 = 0
                r1.delete(r3, r4, r4)
                r9.clear = r2
            L_0x0014:
                java.util.Set<java.lang.String> r1 = r9.remove
                java.util.Iterator r1 = r1.iterator()
            L_0x001a:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = "key = ?"
                if (r3 == 0) goto L_0x0035
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                android.content.ContentResolver r5 = r9.cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.a.f14199a
                java.lang.String[] r3 = new java.lang.String[]{r3}
                r5.delete(r6, r4, r3)
                goto L_0x001a
            L_0x0035:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r9.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x003f:
                boolean r3 = r1.hasNext()
                r5 = 1
                if (r3 == 0) goto L_0x00c0
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r6 = r3.getValue()
                java.lang.String r7 = "MicroMsg.SDK.PluginProvider.Resolver"
                if (r6 != 0) goto L_0x005c
                java.lang.String r5 = "unresolve failed, null value"
            L_0x0057:
                com.tencent.mm.opensdk.utils.Log.e(r7, r5)
                r5 = 0
                goto L_0x0097
            L_0x005c:
                boolean r8 = r6 instanceof java.lang.Integer
                if (r8 == 0) goto L_0x0061
                goto L_0x0097
            L_0x0061:
                boolean r5 = r6 instanceof java.lang.Long
                if (r5 == 0) goto L_0x0067
                r5 = 2
                goto L_0x0097
            L_0x0067:
                boolean r5 = r6 instanceof java.lang.String
                if (r5 == 0) goto L_0x006d
                r5 = 3
                goto L_0x0097
            L_0x006d:
                boolean r5 = r6 instanceof java.lang.Boolean
                if (r5 == 0) goto L_0x0073
                r5 = 4
                goto L_0x0097
            L_0x0073:
                boolean r5 = r6 instanceof java.lang.Float
                if (r5 == 0) goto L_0x0079
                r5 = 5
                goto L_0x0097
            L_0x0079:
                boolean r5 = r6 instanceof java.lang.Double
                if (r5 == 0) goto L_0x007f
                r5 = 6
                goto L_0x0097
            L_0x007f:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r8 = "unresolve failed, unknown type="
                r5.<init>(r8)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.toString()
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                goto L_0x0057
            L_0x0097:
                if (r5 != 0) goto L_0x009a
                goto L_0x003f
            L_0x009a:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.String r7 = "type"
                r0.put(r7, r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r6 = "value"
                r0.put(r6, r5)
                android.content.ContentResolver r5 = r9.cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.a.f14199a
                java.lang.Object r3 = r3.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String[] r3 = new java.lang.String[]{r3}
                r5.update(r6, r0, r4, r3)
                goto L_0x003f
            L_0x00c0:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.openapi.MMSharedPreferences.REditor.commit():boolean");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.values.put(str, Boolean.valueOf(z));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            this.values.put(str, Float.valueOf(f));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.values.put(str, Integer.valueOf(i));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.values.put(str, Long.valueOf(j));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
