package com.taobao.tao.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import tb.el7;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View ContentView;
    public Context applicationContext;
    public boolean isShowing;
    public Button ivCancel;
    public ImageView ivIcon;
    public Button ivNeutral;
    public Button ivOK;
    public int list_item_height;
    public LinearLayout llButtons;
    public DialogInterface.OnCancelListener mCancelListener;
    public el7 mDialog;
    public ListView mListView;
    public View.OnClickListener mNegativeListener;
    public View.OnClickListener mNeutralListener;
    public View.OnClickListener mPositiveListener;
    public RelativeLayout rlButtonsbg;
    public RelativeLayout rlCoustomContent;
    public TextView tvMessage;
    public TextView tvTitle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Activity mActivity;
        private int mIconResId = 0;
        private String mTitle = "";
        private CharSequence mMessage = "";
        private CharSequence mPositiveText = null;
        private CharSequence mNegativeText = null;
        private CharSequence mNeutralText = null;
        private View.OnClickListener mPositiveListener = null;
        private View.OnClickListener mNegativeListener = null;
        private View.OnClickListener mNeutralListener = null;
        private boolean mCancelable = true;
        private DialogInterface.OnCancelListener mOnCancelListener = null;
        private View mView = null;
        private boolean isShowPhoneTaoHelpHit = false;

        static {
            t2o.a(775946438);
        }

        public Builder(Activity activity) {
            this.mActivity = activity;
        }

        public TBDialog create() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBDialog) ipChange.ipc$dispatch("7363a87f", new Object[]{this});
            }
            final TBDialog tBDialog = new TBDialog(this.mActivity);
            int i = this.mIconResId;
            if (i != 0) {
                tBDialog.setIcon(i);
            }
            tBDialog.setTitle(this.mTitle);
            tBDialog.setMessage(this.mMessage);
            tBDialog.setShowPhoneTaoHelpHit(this.isShowPhoneTaoHelpHit);
            CharSequence charSequence = this.mPositiveText;
            if (charSequence == null || charSequence.length() == 0) {
                View.OnClickListener onClickListener = this.mPositiveListener;
                if (onClickListener != null) {
                    tBDialog.setPositiveButton(onClickListener);
                }
            } else {
                tBDialog.setPositiveButtonText(this.mPositiveText);
                View.OnClickListener onClickListener2 = this.mPositiveListener;
                if (onClickListener2 != null) {
                    tBDialog.setPositiveButton(onClickListener2);
                } else {
                    tBDialog.setPositiveButton(new View.OnClickListener() { // from class: com.taobao.tao.util.TBDialog.Builder.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else {
                                tBDialog.dismiss();
                            }
                        }
                    });
                }
            }
            CharSequence charSequence2 = this.mNeutralText;
            if (charSequence2 == null || charSequence2.length() == 0) {
                View.OnClickListener onClickListener3 = this.mNeutralListener;
                if (onClickListener3 != null) {
                    tBDialog.setNeutralButton(onClickListener3);
                }
            } else {
                tBDialog.setNeutralButtonText(this.mNeutralText);
                View.OnClickListener onClickListener4 = this.mPositiveListener;
                if (onClickListener4 != null) {
                    tBDialog.setNeutralButton(onClickListener4);
                } else {
                    tBDialog.setNeutralButton(new View.OnClickListener() { // from class: com.taobao.tao.util.TBDialog.Builder.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else {
                                tBDialog.dismiss();
                            }
                        }
                    });
                }
            }
            CharSequence charSequence3 = this.mNegativeText;
            if (charSequence3 == null || charSequence3.length() == 0) {
                View.OnClickListener onClickListener5 = this.mNegativeListener;
                if (onClickListener5 != null) {
                    tBDialog.setNegativeButton(onClickListener5);
                }
            } else {
                tBDialog.setNegativeButtonText(this.mNegativeText);
                View.OnClickListener onClickListener6 = this.mNegativeListener;
                if (onClickListener6 != null) {
                    tBDialog.setNegativeButton(onClickListener6);
                } else {
                    tBDialog.setNegativeButton(new View.OnClickListener() { // from class: com.taobao.tao.util.TBDialog.Builder.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else {
                                tBDialog.dismiss();
                            }
                        }
                    });
                }
            }
            tBDialog.setCancelable(this.mCancelable);
            tBDialog.setOnCancelListener(this.mOnCancelListener);
            tBDialog.setCustomView(this.mView);
            return tBDialog;
        }

        public boolean isShowPhoneTaoHelpHit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6b66a962", new Object[]{this})).booleanValue();
            }
            return this.isShowPhoneTaoHelpHit;
        }

        public Builder setCancelable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("308aa474", new Object[]{this, new Boolean(z)});
            }
            this.mCancelable = z;
            return this;
        }

        public Builder setIcon(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("50d6568a", new Object[]{this, new Integer(i)});
            }
            this.mIconResId = i;
            return this;
        }

        public Builder setMessage(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("bdaa3754", new Object[]{this, new Integer(i)}) : setMessage(Globals.getApplication().getString(i));
        }

        public Builder setNegativeButton(int i, View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("d1550ac5", new Object[]{this, new Integer(i), onClickListener}) : setNegativeButton(Globals.getApplication().getString(i), onClickListener);
        }

        public Builder setNeutralButton(int i, View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("af174fb7", new Object[]{this, new Integer(i), onClickListener}) : setNeutralButton(Globals.getApplication().getString(i), onClickListener);
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("280b927c", new Object[]{this, onCancelListener});
            }
            this.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setPositiveButton(int i, View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("8c489e81", new Object[]{this, new Integer(i), onClickListener}) : setPositiveButton(Globals.getApplication().getString(i), onClickListener);
        }

        public Builder setShowPhoneTaoHelpHit(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7590fa7d", new Object[]{this, new Boolean(z)});
            }
            this.isShowPhoneTaoHelpHit = z;
            return this;
        }

        public Builder setTitle(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("b5acbbe5", new Object[]{this, new Integer(i)}) : setTitle(Globals.getApplication().getString(i));
        }

        public Builder setView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2985cdc7", new Object[]{this, view});
            }
            this.mView = view;
            return this;
        }

        public TBDialog show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBDialog) ipChange.ipc$dispatch("ec22729e", new Object[]{this});
            }
            TBDialog create = create();
            create.show();
            return create;
        }

        public Builder setMessage(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9f18fc3b", new Object[]{this, charSequence});
            }
            this.mMessage = charSequence;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3f2cbb06", new Object[]{this, charSequence, onClickListener});
            }
            this.mNegativeText = charSequence;
            this.mNegativeListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("aa9705d4", new Object[]{this, charSequence, onClickListener});
            }
            this.mNeutralText = charSequence;
            this.mNeutralListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d908b3ca", new Object[]{this, charSequence, onClickListener});
            }
            this.mPositiveText = charSequence;
            this.mPositiveListener = onClickListener;
            return this;
        }

        public Builder setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e8065d64", new Object[]{this, str});
            }
            this.mTitle = str;
            return this;
        }
    }

    static {
        t2o.a(775946432);
    }

    public TBDialog(Activity activity) {
        this(activity, 0, (String) null, (String) null, (View) null);
    }

    private int getButtonsHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7479fcc", new Object[]{this})).intValue();
        }
        float f = Constants.screen_density;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        return (int) (f * 44.0f);
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        el7 el7Var = this.mDialog;
        if (el7Var != null && this.isShowing) {
            el7Var.setOnCancelListener(null);
            ListView listView = this.mListView;
            if (listView != null) {
                listView.setOnItemClickListener(null);
                this.mListView.setOnItemLongClickListener(null);
                this.mListView.setOnItemSelectedListener(null);
                this.mListView = null;
            }
            try {
                this.mDialog.dismiss();
            } catch (Exception unused) {
            }
            this.isShowing = false;
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            this.mDialog.hide();
        }
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        el7 el7Var = this.mDialog;
        if (el7Var != null) {
            return el7Var.isShowing();
        }
        return this.isShowing;
    }

    public void setBackgroundResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9196be", new Object[]{this, new Integer(i)});
        } else {
            this.ContentView.findViewById(R.id.TBDialog_content_ly).setBackgroundResource(i);
        }
    }

    public void setCancelable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5895817", new Object[]{this, new Boolean(z)});
        } else {
            this.mDialog.setCancelable(z);
        }
    }

    public void setCustomView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601372a4", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.tvMessage;
        if (textView != null && this.rlCoustomContent != null) {
            textView.setVisibility(8);
            this.rlCoustomContent.addView(View.inflate(this.applicationContext, i, null));
        }
    }

    public void setIcon(int i) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b5841", new Object[]{this, new Integer(i)});
        } else if (i != 0 && (imageView = this.ivIcon) != null) {
            imageView.setVisibility(0);
            this.ivIcon.setImageResource(i);
        }
    }

    public void setItems(int i, AdapterView.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e06c7e", new Object[]{this, new Integer(i), onItemClickListener});
        } else {
            setItems(this.applicationContext.getResources().getStringArray(i), onItemClickListener);
        }
    }

    public void setMessage(CharSequence charSequence) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
        } else if (charSequence != null && (textView = this.tvMessage) != null) {
            textView.setVisibility(0);
            this.tvMessage.setText(charSequence);
        }
    }

    public void setNegativeButton(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d2fd69", new Object[]{this, onClickListener});
        } else if (this.llButtons != null && this.ivCancel != null && this.rlButtonsbg != null) {
            this.rlCoustomContent.setPadding(0, 0, 0, getButtonsHeight());
            this.rlButtonsbg.setVisibility(0);
            this.llButtons.setVisibility(0);
            this.ivCancel.setVisibility(0);
            this.mNegativeListener = onClickListener;
            this.ivCancel.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.util.TBDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    View.OnClickListener onClickListener2 = TBDialog.this.mNegativeListener;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                        TBDialog.this.dismiss();
                    }
                }
            });
        }
    }

    public void setNegativeButtonText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10a2cc1", new Object[]{this, charSequence});
        } else if (this.llButtons != null && this.ivOK != null && this.rlButtonsbg != null) {
            this.ivCancel.setText(charSequence);
        }
    }

    public void setNeutralButton(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4336a7db", new Object[]{this, onClickListener});
            return;
        }
        LinearLayout linearLayout = this.llButtons;
        if (linearLayout != null && this.ivNeutral != null && this.rlButtonsbg != null) {
            linearLayout.setVisibility(0);
            this.rlCoustomContent.setPadding(0, 0, 0, getButtonsHeight());
            this.rlButtonsbg.setVisibility(0);
            this.ivNeutral.setVisibility(0);
            Button button = this.ivOK;
            if (button != null) {
                button.setBackgroundResource(R.drawable.button_bg_normal_gray);
            }
            this.mNeutralListener = onClickListener;
            this.ivNeutral.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.util.TBDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    View.OnClickListener onClickListener2 = TBDialog.this.mNeutralListener;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                        TBDialog.this.dismiss();
                    }
                }
            });
        }
    }

    public void setNeutralButtonText(CharSequence charSequence) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eeb7e8f", new Object[]{this, charSequence});
        } else if (this.llButtons != null && (button = this.ivNeutral) != null && this.rlButtonsbg != null) {
            button.setText(charSequence);
        }
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        el7 el7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04fa50f", new Object[]{this, onCancelListener});
            return;
        }
        this.mCancelListener = onCancelListener;
        if (onCancelListener == null && (el7Var = this.mDialog) != null) {
            el7Var.setOnCancelListener(null);
        }
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        } else {
            this.mDialog.setOnDismissListener(onDismissListener);
        }
    }

    public void setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f538649d", new Object[]{this, onKeyListener});
        } else {
            this.mDialog.setOnKeyListener(onKeyListener);
        }
    }

    public void setPositiveButton(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690fe25", new Object[]{this, onClickListener});
            return;
        }
        LinearLayout linearLayout = this.llButtons;
        if (linearLayout != null && this.ivOK != null && this.rlButtonsbg != null) {
            linearLayout.setVisibility(0);
            this.rlCoustomContent.setPadding(0, 0, 0, getButtonsHeight());
            this.rlButtonsbg.setVisibility(0);
            this.ivOK.setVisibility(0);
            this.mPositiveListener = onClickListener;
            this.ivOK.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.util.TBDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    View.OnClickListener onClickListener2 = TBDialog.this.mPositiveListener;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                        TBDialog.this.dismiss();
                    }
                }
            });
        }
    }

    public void setPositiveButtonText(CharSequence charSequence) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b614785", new Object[]{this, charSequence});
        } else if (this.llButtons != null && (button = this.ivOK) != null && this.rlButtonsbg != null) {
            button.setText(charSequence);
        }
    }

    public void setShowPhoneTaoHelpHit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da4bc6e", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.ContentView.findViewById(R.id.TBDialog_mobilephone_assistant).setVisibility(0);
        }
    }

    public void setSingleChoiceItems(int i, int i2, AdapterView.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7a873c", new Object[]{this, new Integer(i), new Integer(i2), onItemClickListener});
        } else {
            setSingleChoiceItems(this.applicationContext.getResources().getStringArray(i), i2, onItemClickListener);
        }
    }

    public void setTitle(String str) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else if (str != null && (textView = this.tvTitle) != null) {
            textView.setText(str);
        }
    }

    public void show() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        el7 el7Var = this.mDialog;
        if (el7Var != null && (view = this.ContentView) != null) {
            el7Var.setContentView(view);
            try {
                this.mDialog.show();
            } catch (Exception unused) {
            }
            this.isShowing = true;
            this.mDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.tao.util.TBDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    DialogInterface.OnCancelListener onCancelListener = TBDialog.this.mCancelListener;
                    if (onCancelListener != null) {
                        onCancelListener.onCancel(dialogInterface);
                    }
                    TBDialog.this.mDialog.setOnCancelListener(null);
                }
            });
        }
    }

    public TBDialog(Activity activity, String str, int i) {
        this(activity, 0, str, i);
    }

    public TBDialog(Activity activity, String str, View view) {
        this(activity, 0, str, view);
    }

    public void setItems(CharSequence[] charSequenceArr, AdapterView.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271280b4", new Object[]{this, charSequenceArr, onItemClickListener});
        } else if (charSequenceArr != null && charSequenceArr.length > 0) {
            this.mListView = null;
            this.mListView = new ListView(this.applicationContext);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.applicationContext, R.layout.tb_dialog_item, (String[]) charSequenceArr);
            this.mListView.setBackgroundColor(0);
            this.mListView.setDivider(new ColorDrawable(Globals.getApplication().getResources().getColor(R.color.K_black_light_6)));
            this.mListView.setDividerHeight(1);
            this.mListView.setSelector(R.color.transparent);
            this.mListView.setCacheColorHint(0);
            this.mListView.setAdapter((ListAdapter) arrayAdapter);
            this.mListView.setItemsCanFocus(true);
            this.mListView.setOnItemClickListener(onItemClickListener);
            setCustomView(this.mListView);
        }
    }

    public void setSingleChoiceItems(CharSequence[] charSequenceArr, int i, AdapterView.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c084c6", new Object[]{this, charSequenceArr, new Integer(i), onItemClickListener});
        } else if (charSequenceArr != null && charSequenceArr.length > 0) {
            ListView listView = new ListView(this.applicationContext);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.applicationContext, R.layout.tb_dialog_list_item_single_choice, (String[]) charSequenceArr);
            listView.setBackgroundColor(0);
            listView.setDivider(new ColorDrawable(Globals.getApplication().getResources().getColor(R.color.K_black_light_6)));
            listView.setDividerHeight(1);
            listView.setSelector(R.color.transparent);
            listView.setCacheColorHint(0);
            listView.setAdapter((ListAdapter) arrayAdapter);
            listView.setItemsCanFocus(true);
            listView.setChoiceMode(1);
            listView.setOnItemClickListener(onItemClickListener);
            if (i >= 0 && i < charSequenceArr.length) {
                listView.setItemChecked(i, true);
            }
            float f = Constants.screen_density;
            int i2 = (int) (Constants.screen_height - (176.0f * f));
            if (this.list_item_height * f * charSequenceArr.length >= i2) {
                setCustomView(listView, new RelativeLayout.LayoutParams(-1, i2));
            } else {
                setCustomView(listView, new RelativeLayout.LayoutParams(-1, -2));
            }
        }
    }

    public TBDialog(Activity activity, String str, String str2) {
        this(activity, 0, str, str2, (View) null);
    }

    public void setCustomView(View view) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d77233", new Object[]{this, view});
        } else if (view != null && (textView = this.tvMessage) != null && this.rlCoustomContent != null) {
            textView.setVisibility(8);
            this.rlCoustomContent.removeAllViews();
            this.rlCoustomContent.addView(view);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TBDialog(android.app.Activity r3, int r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            if (r4 != 0) goto L_0x0006
            r4 = r0
            goto L_0x000e
        L_0x0006:
            android.app.Application r1 = com.taobao.tao.Globals.getApplication()
            java.lang.String r4 = r1.getString(r4)
        L_0x000e:
            if (r5 != 0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            android.app.Application r0 = com.taobao.tao.Globals.getApplication()
            java.lang.String r0 = r0.getString(r5)
        L_0x0019:
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.TBDialog.<init>(android.app.Activity, int, int):void");
    }

    public TBDialog(Activity activity, int i, String str, View view) {
        this(activity, i, str, (String) null, view);
    }

    public void setCustomView(View view, RelativeLayout.LayoutParams layoutParams) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3934708f", new Object[]{this, view, layoutParams});
        } else if (view != null && (textView = this.tvMessage) != null && this.rlCoustomContent != null) {
            textView.setVisibility(8);
            this.rlCoustomContent.removeAllViews();
            this.rlCoustomContent.addView(view, layoutParams);
        }
    }

    public TBDialog(Activity activity, int i, String str, int i2) {
        this(activity, i, str, (String) null, i2);
    }

    public TBDialog(Activity activity, int i, String str, String str2) {
        this(activity, i, str, str2, (View) null);
    }

    private TBDialog(Activity activity, int i, String str, String str2, int i2) {
        this(activity, i, str, str2, View.inflate(activity, i2, null));
    }

    private TBDialog(Activity activity, int i, String str, String str2, View view) {
        this(activity, i, str, str2, view, false);
    }

    public TBDialog(Activity activity, int i, String str, String str2, View view, boolean z) {
        this.list_item_height = 48;
        this.isShowing = false;
        if (activity != null) {
            this.applicationContext = activity.getApplicationContext();
            try {
                this.mDialog = new el7(activity, R.style.TBDialog);
                View inflate = View.inflate(activity.getApplicationContext(), R.layout.tb_dialog_frame, null);
                this.ContentView = inflate;
                if (z) {
                    inflate.setPadding(0, 0, 0, 0);
                }
                this.ivIcon = (ImageView) this.ContentView.findViewById(R.id.TBDialog_icon);
                this.tvMessage = (TextView) this.ContentView.findViewById(R.id.TBDialog_content_message);
                this.rlCoustomContent = (RelativeLayout) this.ContentView.findViewById(R.id.TBDialog_content_coustom);
                this.rlButtonsbg = (RelativeLayout) this.ContentView.findViewById(R.id.TBDialog_buttons_bg);
                this.llButtons = (LinearLayout) this.ContentView.findViewById(R.id.TBDialog_buttons);
                this.ivNeutral = (Button) this.ContentView.findViewById(R.id.TBDialog_buttons_Neutral);
                if (BuiltConfig.getBoolean(R.string.isNormalDialogStyle)) {
                    this.ivOK = (Button) this.ContentView.findViewById(R.id.TBDialog_buttons_OK);
                    this.ivCancel = (Button) this.ContentView.findViewById(R.id.TBDialog_buttons_Cancel);
                } else {
                    this.ivCancel = (Button) this.ContentView.findViewById(R.id.TBDialog_buttons_OK);
                    Button button = (Button) this.ContentView.findViewById(R.id.TBDialog_buttons_Cancel);
                    this.ivOK = button;
                    button.setText(R.string.Ensure);
                    this.ivOK.setBackgroundResource(R.drawable.button_bg_normal);
                    this.ivCancel.setText(R.string.Cancel);
                    this.ivCancel.setBackgroundResource(R.drawable.button_bg_normal_gray);
                }
                if (!BuiltConfig.getBoolean(R.string.isMotoDevice) && Constants.screen_height > 800) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, 0, 0, (int) (Constants.screen_density * (-20.0f)));
                    this.rlCoustomContent.setLayoutParams(layoutParams);
                }
                setIcon(i);
                setTitle(str);
                setMessage(str2);
                setCustomView(view);
                this.mDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.taobao.tao.util.TBDialog.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnKeyListener
                    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i2), keyEvent})).booleanValue();
                        }
                        if (keyEvent.getRepeatCount() > 0) {
                            return true;
                        }
                        return false;
                    }
                });
            } catch (Exception e) {
                this.mDialog = new el7(activity, R.style.TBDialog);
                e.printStackTrace();
            }
        }
    }
}
