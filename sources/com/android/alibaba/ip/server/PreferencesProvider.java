package com.android.alibaba.ip.server;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.utils.PreferencesUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class PreferencesProvider extends ContentProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOOLEAN_CONTENT_URI_CODE = 105;
    public static final int CLEAR_CONTENT_URI_CODE = 108;
    public static final int DELETE_CONTENT_URI_CODE = 106;
    public static final int FLOAT_CONTENT_URI_CODE = 104;
    public static final int INTEGER_CONTENT_URI_CODE = 101;
    public static final int LONG_CONTENT_URI_CODE = 102;
    public static final int PUTS_CONTENT_URI_CODE = 107;
    public static final int STRING_CONTENT_URI_CODE = 100;
    private UriMatcher mUriMatcher;
    public static String COLUMNNAME = "SPCOLUMNNAME";
    public static String AUTHORITIES_KEY = "authorities_key";
    public static String AUTHORITIES_SPNAME = "authorities_spname";
    private String mStringPath = "string/*/*/";
    private String mIntegerPath = "integer/*/*/";
    private String mLongPath = "long/*/*/";
    private String mFloatPath = "float/*/*/";
    private String mBooleanPath = "boolean/*/*/";
    private String mDeletePath = "delete/*/*/";
    private String mPutsPath = "puts";
    private String mClearPath = "clear/*/";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Model {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object defValue;
        private String key;
        private String spName;

        static {
            t2o.a(493879335);
        }

        private Model() {
        }

        public static /* synthetic */ String access$000(Model model) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("659977f", new Object[]{model});
            }
            return model.spName;
        }

        public Object getDefValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f1691ce9", new Object[]{this});
            }
            return this.defValue;
        }

        public String getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
            }
            return this.key;
        }

        public String getSpName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("398d003b", new Object[]{this});
            }
            return this.spName;
        }

        public void setDefValue(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("deaf7111", new Object[]{this, obj});
            } else {
                this.defValue = obj;
            }
        }

        public void setKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b06c2d6e", new Object[]{this, str});
            } else {
                this.key = str;
            }
        }

        public void setSpName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97bcf49b", new Object[]{this, str});
            } else {
                this.spName = str;
            }
        }
    }

    static {
        t2o.a(493879333);
    }

    private Cursor buildCursor(Context context, Model model, int i) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("d0a585af", new Object[]{this, context, model, new Integer(i)});
        }
        int defValue = model.getDefValue();
        switch (i) {
            case 100:
                if (defValue != null) {
                    obj = PreferencesUtils.getString(context, model.getSpName(), model.getKey(), String.valueOf(defValue));
                    break;
                } else {
                    obj = PreferencesUtils.getString(context, model.getSpName(), model.getKey());
                    break;
                }
            case 101:
                if (defValue != null) {
                    if (!TextUtils.isDigitsOnly(defValue + "")) {
                        defValue = -1;
                    }
                    obj = Integer.valueOf(PreferencesUtils.getInt(context, model.getSpName(), model.getKey(), Integer.parseInt(defValue + "")));
                    break;
                } else {
                    obj = Integer.valueOf(PreferencesUtils.getInt(context, model.getSpName(), model.getKey()));
                    break;
                }
            case 102:
                if (defValue != null) {
                    if (!TextUtils.isDigitsOnly(defValue + "")) {
                        defValue = -1;
                    }
                    obj = Long.valueOf(PreferencesUtils.getLong(context, model.getSpName(), model.getKey(), Long.parseLong(defValue + "")));
                    break;
                } else {
                    obj = Long.valueOf(PreferencesUtils.getLong(context, model.getSpName(), model.getKey()));
                    break;
                }
            case 103:
            default:
                obj = null;
                break;
            case 104:
                if (defValue != null) {
                    obj = Float.valueOf(PreferencesUtils.getFloat(context, model.getSpName(), model.getKey(), Float.parseFloat(defValue + "")));
                    break;
                } else {
                    obj = Float.valueOf(PreferencesUtils.getFloat(context, model.getSpName(), model.getKey()));
                    break;
                }
            case 105:
                if (defValue != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(PreferencesUtils.getBoolean(context, model.getSpName(), model.getKey(), Boolean.valueOf(defValue + "").booleanValue()));
                    sb.append("");
                    obj = sb.toString();
                    break;
                } else {
                    obj = PreferencesUtils.getBoolean(context, model.getSpName(), model.getKey()) + "";
                    break;
                }
        }
        if (obj == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{COLUMNNAME});
        matrixCursor.addRow(new Object[]{obj});
        return matrixCursor;
    }

    private void clear(Context context, Model model) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5bb364", new Object[]{this, context, model});
        } else {
            PreferencesUtils.getEditor(context, model.getSpName()).clear().apply();
        }
    }

    private Model getModel(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Model) ipChange.ipc$dispatch("8d004b15", new Object[]{this, uri});
        }
        try {
            Model model = new Model();
            model.setSpName(uri.getPathSegments().get(1));
            if (uri.getPathSegments().size() > 2) {
                model.setKey(uri.getPathSegments().get(2));
            }
            if (uri.getPathSegments().size() > 3) {
                model.setDefValue(uri.getPathSegments().get(3));
            }
            return model;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(PreferencesProvider preferencesProvider, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/alibaba/ip/server/PreferencesProvider");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89592153", new Object[]{this, uri, str, strArr})).intValue();
        }
        Model model = getModel(uri);
        if (model == null) {
            return -1;
        }
        int match = this.mUriMatcher.match(uri);
        if (match == 106) {
            delete(getContext(), model);
        } else if (match == 108 && !TextUtils.isEmpty(Model.access$000(model))) {
            clear(getContext(), model);
        }
        return 0;
    }

    public abstract String getAuthorities();

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb070cb0", new Object[]{this, uri});
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("77bd6b8c", new Object[]{this, uri, contentValues});
        }
        Model model = getModel(uri);
        if (model == null) {
            return null;
        }
        int match = this.mUriMatcher.match(uri);
        if (match == 100 || match == 101 || match == 102 || match == 104 || match == 105 || match == 107) {
            insert(getContext(), contentValues, model);
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a7a6c6", new Object[]{this})).booleanValue();
        }
        String authorities = getAuthorities();
        PreferencesUtils.putString(getContext(), AUTHORITIES_SPNAME, AUTHORITIES_KEY, authorities);
        PreferencesUtils.commit(AUTHORITIES_SPNAME);
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.mUriMatcher = uriMatcher;
        uriMatcher.addURI(authorities, this.mStringPath, 100);
        UriMatcher uriMatcher2 = this.mUriMatcher;
        uriMatcher2.addURI(authorities, this.mStringPath + "*/", 100);
        this.mUriMatcher.addURI(authorities, this.mIntegerPath, 101);
        UriMatcher uriMatcher3 = this.mUriMatcher;
        uriMatcher3.addURI(authorities, this.mIntegerPath + "*/", 101);
        this.mUriMatcher.addURI(authorities, this.mLongPath, 102);
        UriMatcher uriMatcher4 = this.mUriMatcher;
        uriMatcher4.addURI(authorities, this.mLongPath + "*/", 102);
        this.mUriMatcher.addURI(authorities, this.mFloatPath, 104);
        UriMatcher uriMatcher5 = this.mUriMatcher;
        uriMatcher5.addURI(authorities, this.mFloatPath + "*/", 104);
        this.mUriMatcher.addURI(authorities, this.mBooleanPath, 105);
        UriMatcher uriMatcher6 = this.mUriMatcher;
        uriMatcher6.addURI(authorities, this.mBooleanPath + "*/", 105);
        this.mUriMatcher.addURI(authorities, this.mDeletePath, 106);
        this.mUriMatcher.addURI(authorities, this.mClearPath, 108);
        this.mUriMatcher.addURI(authorities, this.mPutsPath, 107);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("ad900bff", new Object[]{this, uri, strArr, str, strArr2, str2});
        }
        Model model = getModel(uri);
        if (model == null) {
            return null;
        }
        return buildCursor(getContext(), model, this.mUriMatcher.match(uri));
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68d633c3", new Object[]{this, uri, contentValues, str, strArr})).intValue();
        }
        Model model = getModel(uri);
        if (model == null) {
            return -1;
        }
        int match = this.mUriMatcher.match(uri);
        if (match == 100 || match == 101 || match == 102 || match == 104 || match == 105) {
            insert(getContext(), contentValues, model);
        }
        return 0;
    }

    private void insert(Context context, ContentValues contentValues, Model model) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe14ba4", new Object[]{this, context, contentValues, model});
            return;
        }
        SharedPreferences.Editor editor = PreferencesUtils.getEditor(context, model.getSpName());
        for (String str : contentValues.keySet()) {
            Object obj = contentValues.get(str);
            if (obj instanceof Integer) {
                editor.putInt(str, Integer.parseInt(obj + ""));
            } else if (obj instanceof Long) {
                editor.putLong(str, Long.parseLong(obj + ""));
            } else if (obj instanceof Float) {
                editor.putFloat(str, Float.parseFloat(obj + ""));
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str, Boolean.valueOf(obj + "").booleanValue());
            } else {
                StringBuilder sb = new StringBuilder();
                if (obj == null) {
                    obj = "";
                }
                sb.append(obj);
                sb.append("");
                editor.putString(str, sb.toString());
            }
        }
        editor.apply();
    }

    private void delete(Context context, Model model) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a79842", new Object[]{this, context, model});
            return;
        }
        SharedPreferences.Editor editor = PreferencesUtils.getEditor(context, model.getSpName());
        editor.remove(model.getKey());
        editor.apply();
    }
}
