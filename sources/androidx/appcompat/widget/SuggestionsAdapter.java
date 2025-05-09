package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DBG = false;
    public static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    public static final int REFINE_ALL = 2;
    public static final int REFINE_BY_ENTRY = 1;
    public static final int REFINE_NONE = 0;
    private final int mCommitIconResId;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private final Context mProviderContext;
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private ColorStateList mUrlColor;
    private boolean mClosed = false;
    private int mQueryRefinement = 1;
    private int mText1Col = -1;
    private int mText2Col = -1;
    private int mText2UrlCol = -1;
    private int mIconName1Col = -1;
    private int mIconName2Col = -1;
    private int mFlagsCol = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class ChildViewCache {
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view) {
            this.mText1 = (TextView) view.findViewById(16908308);
            this.mText2 = (TextView) view.findViewById(16908309);
            this.mIcon1 = (ImageView) view.findViewById(16908295);
            this.mIcon2 = (ImageView) view.findViewById(16908296);
            this.mIconRefine = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.mSearchView = searchView;
        this.mSearchable = searchableInfo;
        this.mCommitIconResId = searchView.getSuggestionCommitIconResId();
        this.mProviderContext = context;
        this.mOutsideDrawablesCache = weakHashMap;
    }

    private Drawable checkIconCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("dc84d648", new Object[]{this, str});
        }
        Drawable.ConstantState constantState = this.mOutsideDrawablesCache.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence formatUrl(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1411d237", new Object[]{this, charSequence});
        }
        if (this.mUrlColor == null) {
            TypedValue typedValue = new TypedValue();
            this.mProviderContext.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
            this.mUrlColor = this.mProviderContext.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.mUrlColor, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable getActivityIcon(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bec803d0", new Object[]{this, componentName});
        }
        PackageManager packageManager = this.mProviderContext.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    private Drawable getActivityIconWithCache(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7e3c1290", new Object[]{this, componentName});
        }
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.mOutsideDrawablesCache.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.mOutsideDrawablesCache.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.mProviderContext.getResources());
        }
        Drawable activityIcon = getActivityIcon(componentName);
        if (activityIcon != null) {
            constantState = activityIcon.getConstantState();
        }
        this.mOutsideDrawablesCache.put(flattenToShortString, constantState);
        return activityIcon;
    }

    public static String getColumnString(Cursor cursor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc0da4a3", new Object[]{cursor, str});
        }
        return getStringOrNull(cursor, cursor.getColumnIndex(str));
    }

    private Drawable getDefaultIcon1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("a73ecba6", new Object[]{this});
        }
        Drawable activityIconWithCache = getActivityIconWithCache(this.mSearchable.getSearchActivity());
        if (activityIconWithCache != null) {
            return activityIconWithCache;
        }
        return this.mProviderContext.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable getDrawable(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2e25a82e", new Object[]{this, uri});
        }
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return getDrawableFromResourceUri(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream openInputStream = this.mProviderContext.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                    try {
                        openInputStream.close();
                    } catch (IOException e) {
                        Log.e(LOG_TAG, "Error closing icon stream for " + uri, e);
                    }
                    return createFromStream;
                }
                throw new FileNotFoundException("Failed to open " + uri);
            }
        } catch (FileNotFoundException e2) {
            StringBuilder sb = new StringBuilder("Icon not found: ");
            sb.append(uri);
            sb.append(", ");
            sb.append(e2.getMessage());
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Icon not found: ");
        sb2.append(uri);
        sb2.append(", ");
        sb2.append(e2.getMessage());
        return null;
    }

    private Drawable getDrawableFromResourceValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("f1a4aa64", new Object[]{this, str});
        }
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.mProviderContext.getPackageName() + "/" + parseInt;
            Drawable checkIconCache = checkIconCache(str2);
            if (checkIconCache != null) {
                return checkIconCache;
            }
            Drawable drawable = ContextCompat.getDrawable(this.mProviderContext, parseInt);
            storeInIconCache(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            "Icon resource not found: ".concat(str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable checkIconCache2 = checkIconCache(str);
            if (checkIconCache2 != null) {
                return checkIconCache2;
            }
            Drawable drawable2 = getDrawable(Uri.parse(str));
            storeInIconCache(str, drawable2);
            return drawable2;
        }
    }

    private Drawable getIcon1(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("76fe6dec", new Object[]{this, cursor});
        }
        int i = this.mIconName1Col;
        if (i == -1) {
            return null;
        }
        Drawable drawableFromResourceValue = getDrawableFromResourceValue(cursor.getString(i));
        if (drawableFromResourceValue != null) {
            return drawableFromResourceValue;
        }
        return getDefaultIcon1();
    }

    private Drawable getIcon2(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c4bde5ed", new Object[]{this, cursor});
        }
        int i = this.mIconName2Col;
        if (i == -1) {
            return null;
        }
        return getDrawableFromResourceValue(cursor.getString(i));
    }

    private static String getStringOrNull(Cursor cursor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("765802dc", new Object[]{cursor, new Integer(i)});
        }
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e(LOG_TAG, "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(SuggestionsAdapter suggestionsAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2137586239:
                super.notifyDataSetInvalidated();
                return null;
            case -1593347805:
                return super.getDropDownView(((Number) objArr[0]).intValue(), (View) objArr[1], (ViewGroup) objArr[2]);
            case -572192374:
                super.changeCursor((Cursor) objArr[0]);
                return null;
            case -286677780:
                super.notifyDataSetChanged();
                return null;
            case 662623122:
                return super.getView(((Number) objArr[0]).intValue(), (View) objArr[1], (ViewGroup) objArr[2]);
            case 1740532540:
                return super.newView((Context) objArr[0], (Cursor) objArr[1], (ViewGroup) objArr[2]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/SuggestionsAdapter");
        }
    }

    private void setViewText(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a971adcd", new Object[]{this, textView, charSequence});
            return;
        }
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void storeInIconCache(String str, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c97ab8", new Object[]{this, str, drawable});
        } else if (drawable != null) {
            this.mOutsideDrawablesCache.put(str, drawable.getConstantState());
        }
    }

    private void updateSpinnerState(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b352f", new Object[]{this, cursor});
            return;
        }
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        int i;
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0758b8", new Object[]{this, view, context, cursor});
            return;
        }
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i2 = this.mFlagsCol;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (childViewCache.mText1 != null) {
            setViewText(childViewCache.mText1, getStringOrNull(cursor, this.mText1Col));
        }
        if (childViewCache.mText2 != null) {
            String stringOrNull = getStringOrNull(cursor, this.mText2UrlCol);
            if (stringOrNull != null) {
                charSequence = formatUrl(stringOrNull);
            } else {
                charSequence = getStringOrNull(cursor, this.mText2Col);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = childViewCache.mText1;
                if (textView != null) {
                    textView.setSingleLine(false);
                    childViewCache.mText1.setMaxLines(2);
                }
            } else {
                TextView textView2 = childViewCache.mText1;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    childViewCache.mText1.setMaxLines(1);
                }
            }
            setViewText(childViewCache.mText2, charSequence);
        }
        ImageView imageView = childViewCache.mIcon1;
        if (imageView != null) {
            setViewDrawable(imageView, getIcon1(cursor), 4);
        }
        ImageView imageView2 = childViewCache.mIcon2;
        if (imageView2 != null) {
            setViewDrawable(imageView2, getIcon2(cursor), 8);
        }
        int i3 = this.mQueryRefinement;
        if (i3 == 2 || (i3 == 1 && (i & 1) != 0)) {
            childViewCache.mIconRefine.setVisibility(0);
            childViewCache.mIconRefine.setTag(childViewCache.mText1.getText());
            childViewCache.mIconRefine.setOnClickListener(this);
            return;
        }
        childViewCache.mIconRefine.setVisibility(8);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public void changeCursor(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde5098a", new Object[]{this, cursor});
        } else if (!this.mClosed) {
            try {
                super.changeCursor(cursor);
                if (cursor != null) {
                    this.mText1Col = cursor.getColumnIndex("suggest_text_1");
                    this.mText2Col = cursor.getColumnIndex("suggest_text_2");
                    this.mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
                    this.mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
                    this.mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
                    this.mFlagsCol = cursor.getColumnIndex("suggest_flags");
                }
            } catch (Exception e) {
                Log.e(LOG_TAG, "error changing cursor and caching columns", e);
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public CharSequence convertToString(Cursor cursor) {
        String columnString;
        String columnString2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a5543a89", new Object[]{this, cursor});
        }
        if (cursor == null) {
            return null;
        }
        String columnString3 = getColumnString(cursor, "suggest_intent_query");
        if (columnString3 != null) {
            return columnString3;
        }
        if (this.mSearchable.shouldRewriteQueryFromData() && (columnString2 = getColumnString(cursor, "suggest_intent_data")) != null) {
            return columnString2;
        }
        if (!this.mSearchable.shouldRewriteQueryFromText() || (columnString = getColumnString(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return columnString;
    }

    public Drawable getDrawableFromResourceUri(Uri uri) throws FileNotFoundException {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("17f5edda", new Object[]{this, uri});
        }
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.mProviderContext.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a1077123", new Object[]{this, new Integer(i), view, viewGroup});
        }
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View newDropDownView = newDropDownView(this.mProviderContext, getCursor(), viewGroup);
            if (newDropDownView != null) {
                ((ChildViewCache) newDropDownView.getTag()).mText1.setText(e.toString());
            }
            return newDropDownView;
        }
    }

    public int getQueryRefinement() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d8273f7", new Object[]{this})).intValue();
        }
        return this.mQueryRefinement;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View newView = newView(this.mProviderContext, getCursor(), viewGroup);
            if (newView != null) {
                ((ChildViewCache) newView.getTag()).mText1.setText(e.toString());
            }
            return newView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("67be6b3c", new Object[]{this, context, cursor, viewGroup});
        }
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new ChildViewCache(newView));
        ((ImageView) newView.findViewById(R.id.edit_query)).setImageResource(this.mCommitIconResId);
        return newView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809705c1", new Object[]{this});
            return;
        }
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.mSearchView.onQueryRefine((CharSequence) tag);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("e2a73666", new Object[]{this, charSequence});
        }
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        if (this.mSearchView.getVisibility() == 0 && this.mSearchView.getWindowVisibility() == 0) {
            try {
                Cursor searchManagerSuggestions = getSearchManagerSuggestions(this.mSearchable, str, 50);
                if (searchManagerSuggestions != null) {
                    searchManagerSuggestions.getCount();
                    return searchManagerSuggestions;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    public void setQueryRefinement(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1fae8b", new Object[]{this, new Integer(i)});
        } else {
            this.mQueryRefinement = i;
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        changeCursor(null);
        this.mClosed = true;
    }

    private void setViewDrawable(ImageView imageView, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fe0579", new Object[]{this, imageView, drawable, new Integer(i)});
            return;
        }
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public Cursor getSearchManagerSuggestions(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("978f0d88", new Object[]{this, searchableInfo, str, new Integer(i)});
        }
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.mProviderContext.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }
}
