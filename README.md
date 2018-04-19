# Intent_intro
one demo app which has many buttons, and these buttons can jump to different UI

2018/4/19

So far, only the first five keys can jump. 

Opens the demo app, creates the corresponding activity and layout XML files based on the code that implements the function.

And then uses 'intent' to achieve jump such as:

```
//ComponentName(packageName, className)
ComponentName comp = new ComponentName(getBaseContext(),lifecycleActivity.class);
Intent intent=new Intent();
intent.setComponent(comp);
intent.setAction("android.intent.action.VIEW");
startActivity(intent);
```
