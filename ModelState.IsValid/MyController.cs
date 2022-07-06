
if (!ModelState.IsValid)
{
    var message = string.Join(" | ", ModelState.Values
        .SelectMany(v => v.Errors)
        .Select(e => e.ErrorMessage));
    System.Diagnostics.Debug.WriteLine("********************* DEBUG START ******************************");
    System.Diagnostics.Debug.WriteLine(message);
    System.Diagnostics.Debug.WriteLine("********************* DEBUG END ********************************");
}
