
# react-native-country-codes

## Getting started

`$ npm install react-native-country-codes --save`

### Mostly automatic installation

`$ react-native link react-native-country-codes`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-country-codes` and add `RNCountryCodes.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNCountryCodes.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNCountryCodesPackage;` to the imports at the top of the file
  - Add `new RNCountryCodesPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-country-codes'
  	project(':react-native-country-codes').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-country-codes/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-country-codes')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNCountryCodes.sln` in `node_modules/react-native-country-codes/windows/RNCountryCodes.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Country.Codes.RNCountryCodes;` to the usings at the top of the file
  - Add `new RNCountryCodesPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNCountryCodes from 'react-native-country-codes';

// TODO: What to do with the module?
RNCountryCodes;
```
  